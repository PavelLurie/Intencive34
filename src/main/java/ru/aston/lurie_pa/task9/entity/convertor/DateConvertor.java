package ru.aston.lurie_pa.task9.entity.convertor;

import javax.persistence.AttributeConverter;
import java.sql.Date;
import java.util.Optional;

public class DateConvertor implements AttributeConverter<Birthday, Date> {
    @Override
    public Date convertToDatabaseColumn(Birthday attribute) {
        return Optional.ofNullable(attribute)
                .map(e -> e.getBirthday())
                .map(Date::valueOf)
                .orElse(null);
    }

    @Override
    public Birthday convertToEntityAttribute(Date date) {
        return Optional.ofNullable(date)
                .map(Date::toLocalDate)
                .map(localDate -> new Birthday(localDate))
                .orElse(null);
    }
}
