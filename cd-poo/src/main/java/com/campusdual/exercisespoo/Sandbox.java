package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

public class Sandbox {

    public static void main(String[] args) {
        Person p = new Person("John", "Doe");
        Teacher t = new Teacher("María", "Montessori", "Educación");
        PoliceOfficer pO = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e infectología");
        p.getDetails();
        t.getDetails();
        pO.getDetails();
        d.getDetails();
    }
}
