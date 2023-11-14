package com.campusdual.exercisespoo.inputoutput;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("src/main/resources/filewriter.txt");
        boolean delete = file.delete();
        if (delete == true){
            System.out.println("Se ha borrado el archivo");
        } else {
            System.out.println("NO se ha borrado el archivo");
        }

    }
}
