package com.campusdual.exercisespoo;

public class Exercise07 {
    //Mostrar los primeros 15 números naturales
    //Sumar los primeros 100 números naturales

    public static void printNNumbers(int num){
        for (int i = 0; i < num; i++){
            System.out.print((i+1)+ " ");
        }
        System.out.println();
    }

    public static int sumNumbers(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++ ){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        printNNumbers(3);
        printNNumbers(22);
        printNNumbers(15);
        printNNumbers(13);

        System.out.println(sumNumbers(100));
        System.out.println(sumNumbers(10));
        System.out.println(sumNumbers(5));

    }
}
