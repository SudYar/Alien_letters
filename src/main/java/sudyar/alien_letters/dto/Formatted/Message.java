package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

    @XmlElement(name = "paragraph")
    private List<String> paragraphs;

    public void addParagraph(String paragraph) {
        if (paragraphs == null) this.paragraphs = new ArrayList<String >();
        paragraphs.add(paragraph);
    }
}
