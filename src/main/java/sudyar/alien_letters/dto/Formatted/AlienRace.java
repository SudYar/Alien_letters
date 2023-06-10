package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AlienRace {
    @XmlAttribute
    private String code;

    public AlienRace(String code) {
        this.code = code;
    }
}
