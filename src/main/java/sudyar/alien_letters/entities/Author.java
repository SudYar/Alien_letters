package sudyar.alien_letters.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @NotNull
    private String surname;

    @NotNull
    private String name;

    @Column(name = "second_name")
    private String secondName;

    @ManyToOne
    private Position position;

}