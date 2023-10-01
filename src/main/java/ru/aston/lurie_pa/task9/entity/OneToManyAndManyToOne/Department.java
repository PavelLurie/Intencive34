package ru.aston.lurie_pa.task9.entity.OneToManyAndManyToOne;

import lombok.*;
import ru.aston.lurie_pa.task9.entity.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "department")
public class Department extends BaseEntity {
    @Column
    private String name;
    @Column
    private String nameChief;
    @Column
    private int amountOfWorkers;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private List<Developer> developers;

}
