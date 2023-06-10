package sudyar.alien_letters.dto.NoFormatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
public class Code {
    @XmlElement
    private String value;

    public Code(String value) {
        this.value = value;
    }

}
