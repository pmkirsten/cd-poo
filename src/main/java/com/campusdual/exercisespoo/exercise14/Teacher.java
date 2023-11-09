package com.campusdual.exercisespoo.exercise14;

public class Teacher extends Person{
    private String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
