package ru.aston.lurie_pa.task9.entity.OneToManyAndManyToOne;

import lombok.*;
import ru.aston.lurie_pa.task9.entity.BaseEntity;
import ru.aston.lurie_pa.task9.entity.convertor.Birthday;
import ru.aston.lurie_pa.task9.entity.convertor.DateConvertor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "developer")
public class Developer extends BaseEntity {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    @Convert(converter = DateConvertor.class)
    private Birthday birthday;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Grade grade;
    @ManyToOne()
    private Department department;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Language language;

}
