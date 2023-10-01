package ru.aston.lurie_pa.task9.entity.OneToOne;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Trainee extends Mentor{
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
//    private String name;
//    private String surname;
    private String course;
    @OneToOne ()
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;


}
