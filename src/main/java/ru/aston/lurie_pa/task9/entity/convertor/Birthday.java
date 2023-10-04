package ru.aston.lurie_pa.task9.entity.convertor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Birthday {
    private LocalDate birthday;
}
