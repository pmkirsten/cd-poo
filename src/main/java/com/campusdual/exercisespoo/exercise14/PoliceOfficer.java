package com.campusdual.exercisespoo.exercise14;

public class PoliceOfficer extends Person{

    private String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    public String getSquad() {
        return this.squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }
}
