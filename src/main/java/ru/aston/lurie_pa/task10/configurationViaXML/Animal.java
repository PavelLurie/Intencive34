package ru.aston.lurie_pa.task10.configurationViaXML;

import org.springframework.stereotype.Component;


    @Component
    public class Animal {
        public void init(){
            System.out.println("Сработал init-method бина animal");
        }

        public void destroy(){
            System.out.println("Сработал destroy-method бина animal");
        }
    }

