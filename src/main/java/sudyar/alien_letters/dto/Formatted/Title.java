package sudyar.alien_letters.dto.Formatted;


import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Title{

    @XmlElement(name = "description")
    private String description;

    @XmlElement
    private Theme theme;

    @XmlElement (name = "alien_race")
    private AlienRace alienRace;
    @XmlElement
    private String created;

    public void setCreated(Date date_time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
        this.created = sdf.format(date_time);
    }
    public void setCreated(String date_time) {
        this.created = date_time;
    }

    @XmlElement
    private Id id;

    @XmlElementWrapper(name = "authors")
    @XmlElement(name = "employee")
    private List<Author> authors;


    public void setTheme(String text) {
        this.theme = new Theme(text);
    }

    public void setAlienRace(String code) {
        this.alienRace = new AlienRace(code);
    }

    public void setId(String value) {
        this.id = new Id(value);
    }

    public void addAuthor(sudyar.alien_letters.entities.Author author) {
        if (authors == null) this.authors = new ArrayList<Author>();
        authors.add(new Author(author));
    }
}

