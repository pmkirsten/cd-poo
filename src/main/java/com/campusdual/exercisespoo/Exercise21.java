package com.campusdual.exercisespoo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {


    public static Set<String> createHashSet(){
        Set<String> data = new HashSet<>();
        data.add("ELEMENT KPRBC");
        data.add("ELEMENT YPBTM");
        data.add("ELEMENT AADXU");
        data.add("ELEMENT RXCGJ");
        data.add("ELEMENT WYMVD");
        data.add("ELEMENT WFGEJ");
        data.add("ELEMENT TYGBS");
        data.add("ELEMENT MAPTK");
        data.add("ELEMENT GJXVE");
        data.add("ELEMENT BAFGL");
        return data;
    }
    public static Set<String> createTreeSet() {
        Set<String> data = new TreeSet<>();
        data.add("ELEMENT KPRBC");
        data.add("ELEMENT YPBTM");
        data.add("ELEMENT AADXU");
        data.add("ELEMENT RXCGJ");
        data.add("ELEMENT WYMVD");
        data.add("ELEMENT WFGEJ");
        data.add("ELEMENT TYGBS");
        data.add("ELEMENT MAPTK");
        data.add("ELEMENT GJXVE");
        data.add("ELEMENT BAFGL");
        return data;
    }

    public static void printSet(Set<String> data){
        for (String s : data){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();
        printSet(hashSet);
        System.out.println("==============");
        printSet(treeSet);
    }
}
