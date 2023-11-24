package com.campusdual.exercisespoo;

import java.util.Stack;

public class Exercise25 {
  public static void main(String[] args) {
    Stack<String> customQueue = new Stack<>();

    customQueue.push("Smith");
    customQueue.push("Montessori");
    customQueue.push("Peralta");
    customQueue.push("House");

    System.out.println(customQueue.peek() + "\n");

    while (!customQueue.isEmpty()) {
      System.out.println(customQueue.pop());
    }
  }
}
