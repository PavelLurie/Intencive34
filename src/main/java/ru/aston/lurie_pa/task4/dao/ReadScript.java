package ru.aston.lurie_pa.task4.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadScript {
    public String getPathScript(String pathScript){
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(pathScript));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
