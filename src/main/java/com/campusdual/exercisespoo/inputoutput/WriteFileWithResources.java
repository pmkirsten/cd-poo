package com.campusdual.exercisespoo.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileWithResources {

    public static void main(String[] args) {
        File file = new File("src/main/resources/filewriter.txt");
        try(PrintWriter pw = new PrintWriter(new FileWriter(file, true))){
            for (int i = 0 ; i < 10; i++){
                pw.println("Número "+(i*3));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
