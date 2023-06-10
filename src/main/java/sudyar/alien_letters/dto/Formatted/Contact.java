package sudyar.alien_letters.dto.Formatted;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @XmlAttribute
    private String value;

    @XmlElement
    private Tel tel;

    @XmlElement
    private Address address;

    public boolean isEmpty(){
        return tel == null && address == null;
    }
}
