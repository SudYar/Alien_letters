package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.*;
import lombok.*;
import sudyar.alien_letters.dto.Formatted.Title;

@Data
@XmlRootElement(name = "letter")
@XmlAccessorType(XmlAccessType.FIELD)
public class FormattedLetter {

    @XmlElement(name = "title")
    private Title title;

    @XmlElement(name = "message")
    private Message message;

    @XmlElement(name = "contacts")
    private Contact contact;

    @XmlElement(name = "sent_time")
    private String sent_time;

}


