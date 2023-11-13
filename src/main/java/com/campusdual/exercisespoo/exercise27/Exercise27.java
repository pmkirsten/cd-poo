package com.campusdual.exercisespoo.exercise27;

public class Exercise27 {


    public static String division(String kaomoji, int dividendo, int divisor) throws KaomojiException{
        try{
            return kaomoji.toLowerCase() + ". El resultado es:  " + dividendo / divisor;
        } catch (ArithmeticException  e){
            return "(╯°□°）╯︵ ┻━┻ ¡Me he olvidado de como se divide!";
        } catch (NullPointerException e1){
           throw new KaomojiException(e1.getMessage());
        } finally {
            System.out.println("Método terminado.");
        }

    }

    public static void main(String[] args) {
        try {
            String result = division(null, 15, 0);
            System.out.println(result);
        }catch (KaomojiException e){
            System.out.println("El programador no a escrito un kaomoji");
        }
    }

}
