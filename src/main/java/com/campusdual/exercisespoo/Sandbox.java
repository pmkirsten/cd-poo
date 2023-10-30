package com.campusdual.exercisespoo;

public class Sandbox {

    public static void main(String[] args) {

        Perro perro1 = new Perro(90, false, "Husky", "Balto", "Blanco");

//        perro1.ladrar();
//
//        perro1.presentarse();

        System.out.println(perro1.nombre);
        System.out.println(perro1.raza);
        System.out.println(perro1.color);

    }
}
