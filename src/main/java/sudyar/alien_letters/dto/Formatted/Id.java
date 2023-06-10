package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Id {
    @XmlAttribute
    private final String description = "Идентификатор письма";

    @XmlAttribute
    private String value;

    public Id(String value) {
        this.value = value;
    }
}
