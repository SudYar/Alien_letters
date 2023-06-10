package sudyar.alien_letters.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "headers")
public class Header {

    @Id
    @Column(name = "code", nullable = false)
    private String code;

    private String description;

    private String theme;

}
