package ru.aston.lurie_pa.task10.value;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("value.properties")
public class SpringConfigValue {
}
