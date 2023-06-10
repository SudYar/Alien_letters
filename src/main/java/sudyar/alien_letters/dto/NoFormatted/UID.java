package sudyar.alien_letters.dto.NoFormatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sudyar.alien_letters.dto.NoFormatted.CodeUid;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
public class UID {

    @XmlElement(name = "code")
    private CodeUid codeUid;

}
