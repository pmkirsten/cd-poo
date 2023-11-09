package com.campusdual.exercisespoo.exercise16;

public class Tractor implements IMachine{

  public int hp;

  public Tractor(int hp) {
    this.hp = hp;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  @Override
  public void start() {
    System.out.println("El tractor está encendido");
  }

  @Override
  public void stop() {
    System.out.println("El tractor está parado");
  }

  @Override
  public void mantenaince() {
    System.out.println("El tractor está en mantenimiento");
  }

  public String getDetails(){
    return "La potencia del tractor es de " + this.getHp() + " HP";
  }

  public void forward(){
    System.out.println("El tractor avanza");
  }

  public void backward(){
    System.out.println("El tractor retrocede");
  }

}
