package sudyar.alien_letters.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sudyar.alien_letters.dto.Formatted.*;
import sudyar.alien_letters.dto.NoFormatted.AuthorS;
import sudyar.alien_letters.dto.NoFormatted.NoFormattedLetter;
import sudyar.alien_letters.entities.Author;
import sudyar.alien_letters.entities.Header;
import sudyar.alien_letters.repo.AuthorRepository;
import sudyar.alien_letters.repo.HeaderRepository;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Optional;
import java.util.regex.*;

@Service
public class ConvertService {

    @Autowired
    private HeaderRepository headerRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public FormattedLetter convertLetter(NoFormattedLetter letter){
        FormattedLetter newLetter = new FormattedLetter();
        Title title = new Title();
        String code = letter.getCode().getValue();
        Header header = headerRepository.findByCode(code);

        title.setDescription(header.getDescription());
        title.setTheme(header.getTheme());
        title.setAlienRace(letter.getCode().getValue());

//  Костыль, но я уже устал искать, как это сделать нормально
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        TemporalAccessor accessor = timeFormatter.parse(letter.getCreated().getDate_time());
        Date date = Date.from(Instant.from(accessor));
        Instant instant = Instant.ofEpochMilli(date.getTime());
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        ldt = ldt.plusYears(1).plusMonths(1).plusDays(1);
        instant = ldt.toInstant(ZoneOffset.UTC);
        date = Date.from(instant);
        title.setCreated(date);


        title.setId(letter.getUid().getCodeUid().getValue());

        Iterator<AuthorS> itr = letter.getAuthorList().iterator();
        while (itr.hasNext()) {
            String iso = itr.next().getId().getValue();
            Optional<Author> author = authorRepository.findById(iso);
            author.ifPresent(title::addAuthor);
        }
        newLetter.setTitle(title);
        // Теперь message
        Message message = new Message();
        String[] paragraphs= letter.getDocument().getText().split("\n");
        String hello = "";
        switch (code){
            case "A1": hello = "こんにちは"; break;
            case "A2": hello = "Dif-tor heh smusma"; break;
            case "A3": hello = "안녕하세요"; break;
        }

        for (int i = 0; i< paragraphs.length; i++ ){
            if (!"".equals(paragraphs[i].trim()))
                message.addParagraph(paragraphs[i].trim().replace("Здравствуйте", hello));
        }
        message.addParagraph("Надеюсь, это поможет Вам. Если у Вас есть какие-либо дополнительные вопросы, пожалуйста, не стесняйтесь спрашивать. " +
                        "С уважением, Земляне!");

        newLetter.setMessage(message);

        Contact contact = new Contact();
        String cont = letter.getDocument().getTel().getValue();
        StringBuilder clearTel = new StringBuilder();
        if (cont != null) {
            Matcher m = Pattern.compile("\\d+").matcher(cont);
            while (m.find()) {
                clearTel.append(m.group(0));
            }
            contact.setTel(new Tel(clearTel.toString()));
        }
        cont = letter.getDocument().getAddress().getValue();
        if (cont != null) contact.setAddress(new Address(cont));
        if (contact.isEmpty()) contact.setValue("not found");

        newLetter.setContact(contact);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        newLetter.setSent_time(sdf.format(new Date()));


        return newLetter;
    }


}

