package com.campusdual.exercisespoo;

import org.json.simple.JSONObject;

public class Perro {
    int altura;
    boolean esDepeloLargo;
    String raza;
    String nombre;
    String color;

    public Perro(int altura, boolean esDepeloLargo, String raza, String nombre, String color){
        this.altura = altura;
        this.esDepeloLargo = esDepeloLargo;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
    }

    public Perro(JSONObject obj){
        this.altura = Math.toIntExact((long) obj.get("altura"));
        this.esDepeloLargo = (boolean) obj.get("esDepeloLargo");
        this.raza = (String) obj.get("raza");
        this.nombre = (String) obj.get("nombre");
        this.color = (String) obj.get("color");
    }

    public JSONObject toJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("altura", this.getAltura());
        jsonObject.put("esDepeloLargo", this.isEsDepeloLargo());
        jsonObject.put("raza", this.getRaza());
        jsonObject.put("nombre", this.getNombre());
        jsonObject.put("color", this.getColor());
        return jsonObject;
    }


    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isEsDepeloLargo() {
        return this.esDepeloLargo;
    }

    public void setEsDepeloLargo(boolean esDepeloLargo) {
        this.esDepeloLargo = esDepeloLargo;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void ladrar(){
        System.out.println("Guau! Guau!");
    }

    public void presentarse(){
        this.ladrar();
        System.out.println(this.nombre);
    }


    
}
