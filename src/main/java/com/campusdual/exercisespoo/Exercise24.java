package com.campusdual.exercisespoo;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
  public static void main(String[] args) {
    Queue<String> customQueue = new LinkedList<>();

    customQueue.offer("Smith");
    customQueue.offer("Montessori");
    customQueue.offer("Peralta");
    customQueue.offer("House");

    System.out.println(customQueue.peek() + "\n");

    while (!customQueue.isEmpty()) {
      System.out.println(customQueue.poll());
    }
  }
}
