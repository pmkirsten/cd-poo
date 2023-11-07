package com.campusdual.exercisespoo.exercise16;

public class Plane implements IMachine{

    protected String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("El avión está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El avión está apagado");
    }

    @Override
    public void mantenaince() {
        System.out.println("El avión está en mantenimiento");
    }

    public String getDetails(){
        return "La marca del avión es: " + this.getName() ;
    }

    public void takeOff(){
        System.out.println("El avión despega");
    }

    public void land(){
        System.out.println("El avión aterriza");
    }

    public void fly(){
        System.out.println("El avión vuela");
    }
}
