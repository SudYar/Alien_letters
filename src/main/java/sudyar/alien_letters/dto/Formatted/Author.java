package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Author {

    @XmlElement
    private String name;

    @XmlElement
    private String second_name;

    @XmlElement
    private String lastname;

    @XmlElement
    private String position;

    public Author(sudyar.alien_letters.entities.Author author) {
        this.second_name = author.getSurname();
        this.name = author.getName();
        this.lastname = author.getSecondName();
        this.position = author.getPosition().getName();
    }

    public Author() {
        ;
    }
}
