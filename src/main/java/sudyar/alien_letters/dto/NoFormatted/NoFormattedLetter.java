package sudyar.alien_letters.dto.NoFormatted;


import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@Data
@XmlRootElement(name = "Письмо_инопланетянам")
@XmlAccessorType(XmlAccessType.FIELD)
public class NoFormattedLetter {
    @XmlElement(name = "код_расы")
    private Code code;

    @XmlElement
    private CreatedDate created;

    @XmlElement
    private UID uid;

    @XmlElement(name = "author")
    private List<AuthorS> authorList;

    @XmlElement(name = "document")
    private Document document;


    public void setCode(String value) {
        this.code = new Code(value);
    }

    public void setCreated(String date_time) {
        this.created = new CreatedDate(date_time);
    }
    public void setCreated(CreatedDate created) {
        this.created = created;
    }

    public void setUid(String codeValue) {
        this.uid = new UID(new CodeUid(codeValue));
    }
}

