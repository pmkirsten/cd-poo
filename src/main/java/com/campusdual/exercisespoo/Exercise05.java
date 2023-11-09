package com.campusdual.exercisespoo;

public class Exercise05 {
    // Comprobar si un número es positivo o negativo.  Mayor o menor que 0
    // Comprobar si un número es múltiplo de otro. Resto de la división en 0
    // Comprobar si un número es menor a otro. Mayor que el otro

//    if (condición){
//        instrucciones si la condición se cumple
//    } else{
//        instrucciones si la condición NO se cumple
//    }

    public static void main(String[] args) {
        System.out.print("Comprobar positivo o negativo: ");
        esPositivo(0);
        System.out.print("Comprobar múltiplo: ");
        esMultiplo(5,3);
        System.out.print("Comprobar mayor: ");
        esMayor(5,3);

    }

    public static void esPositivo(int num) {
        if (num >= 0){
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0){
            System.out.println("Es múltiplo");
        } else {
            System.out.println("No es múltiplo");
        }
    }

    public static void esMayor(int num1, int num2) {
        if (num1 > num2){
            System.out.println("Es mayor");
        } else if ( num1 < num2){
            System.out.println("Es menor");
        } else{
            System.out.println("Es igual");
        }
    }


}
