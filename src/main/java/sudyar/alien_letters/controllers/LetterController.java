package sudyar.alien_letters.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import sudyar.alien_letters.dto.Formatted.FormattedLetter;
import sudyar.alien_letters.dto.NoFormatted.NoFormattedLetter;
import sudyar.alien_letters.dto.Formatted.Title;
import sudyar.alien_letters.entities.Author;
import sudyar.alien_letters.entities.Position;
import sudyar.alien_letters.service.ConvertService;



@RestController
@RequestMapping(value = "/letters")
public class LetterController {

    @Autowired
    private ConvertService convertService;

    @GetMapping(value = "/getLetter", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<FormattedLetter> getLetter(){
        FormattedLetter letter = new FormattedLetter();
        Title title = new Title();
        title.setDescription("desk");
        title.setTheme("Озеленение страны");
        Author author = new Author();
        author.setName("Иван");
        author.setSurname("Иванович");
        author.setPosition(new Position(1L, "Временная позиция"));
        title.addAuthor(author);
        letter.setTitle(title);
        return ResponseEntity.ok(letter);
    }

    @PostMapping(value = "/postLetter", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<FormattedLetter> postLetter(@RequestBody NoFormattedLetter letter){
        System.out.println(letter);
        return ResponseEntity.ok(convertService.convertLetter(letter));

    }
}
