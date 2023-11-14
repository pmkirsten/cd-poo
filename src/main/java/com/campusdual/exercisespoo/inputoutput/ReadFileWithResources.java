package com.campusdual.exercisespoo.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithResources {

    public static void main(String[] args) {

        File file = new File("src/main/resources/filereader.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file)) ){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
