package com.campusdual.exercisespoo;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String combustible;
    public int velocidad = 0;
    public int revoluciones = 0;

    public Coche(String marca, String modelo, int velocidadMaxima, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible;
    }


    public void arrancar() {
        this.revoluciones = 1000;
    }

    public void apagar() {
        if (this.velocidad == 0) {
            this.revoluciones = 0;
        }
    }

    public int acelerar() {
        if (this.revoluciones != 0) {
            if (this.velocidad < this.velocidadMaxima) {
                this.velocidad = this.velocidad + 10;
            }
        }
        return this.velocidad;
    }

    public int frenar() {
        if (this.velocidad > 0) {
            this.velocidad = this.velocidad - 10;
        }
        return this.velocidad;
    }

    public void girarVolante(int gradosDeGiro) {
        if (gradosDeGiro < 0) {
            System.out.println("Giro a la izquierda ");
        } else {
            System.out.println("Giro a la derecha ");
        }
    }

    public void marchaAtras() {
        System.out.println("Coche marcha atrás ");
    }

    public void mostrarDetalles() {
        System.out.println(this.marca + " " + this.modelo + ". Máx " + this.velocidadMaxima + " km/h. " + this.combustible);
        System.out.println(this.velocidad + " km/h - " + this.revoluciones + " RPM");
    }

    public static void main(String[] args) {
        System.out.println("== CREO EL COCHE ==");
        Coche miCoche = new Coche("Seat", "Ibiza", 170, "Gasolina");
        System.out.println("== MUESTRO LOS DETALLES DEL COCHE ==");
        miCoche.mostrarDetalles();
        System.out.println("== ARRANCO EL COCHE ==");
        miCoche.arrancar();
        System.out.println("== ACELERO EL COCHE ==");
        for (int i = 0; i < 20 ; i++){
            miCoche.acelerar();
        }
        System.out.println("== APAGO EL COCHE ==");
        miCoche.apagar();
        System.out.println("== MUESTRO LOS DETALLES DEL COCHE ==");
        miCoche.mostrarDetalles();
        System.out.println("== FRENO EL COCHE 25 VECES  ==");
        for (int i = 0; i < 25 ; i++){
            miCoche.frenar();
        }
        System.out.println("== MUESTRO LOS DETALLES DEL COCHE ==");
        miCoche.mostrarDetalles();
        System.out.println("== APAGO EL COCHE ==");
        miCoche.apagar();
        System.out.println("== MUESTRO LOS DETALLES DEL COCHE ==");
        miCoche.mostrarDetalles();
    }

}

