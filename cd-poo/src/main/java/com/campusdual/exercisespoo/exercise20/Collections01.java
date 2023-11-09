package com.campusdual.exercisespoo.exercise20;

import java.util.ArrayList;
import java.util.List;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

public class Collections01 {

  public static void main(String[] args) {
    List<Person> stringList = new ArrayList<>();

    stringList.add(new Person("John", "Smith"));
    stringList.add(new Teacher("María", "Montessori", "Educación"));
    stringList.add(new PoliceOfficer("Jack", "Peralta", "B-99"));
    stringList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

    for (Person p : stringList) {
      p.getDetails();
    }
  }
}
