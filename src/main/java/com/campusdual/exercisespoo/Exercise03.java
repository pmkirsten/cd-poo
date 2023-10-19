package com.campusdual.exercisespoo;

public class Exercise03 {

    public static String saludo(String nombre){
        String mensaje = "Hola. Bienvenido, "+ nombre;
        return mensaje;
    }

    public static void fechaActual(String fecha){
        System.out.println(fecha);
    }


    public static void main(String[] args) {
        String mi_mensaje = saludo("Pablo");
        System.out.println(mi_mensaje);
        fechaActual("19/10/2023");
    }

}
