package com.campusdual.exercisespoo.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ReadFile {

    public static void main(String[] args) {
        BufferedReader br = null;
        File file = new File("src/main/resources/filereader.txt");
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
