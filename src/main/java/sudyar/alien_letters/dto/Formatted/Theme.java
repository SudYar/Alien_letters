package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
public class Theme {
    @XmlAttribute
    private String text;
}
