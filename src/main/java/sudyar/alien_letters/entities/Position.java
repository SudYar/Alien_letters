package sudyar.alien_letters.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.*;


@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "positions")
public class Position {
    @XmlTransient
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
}