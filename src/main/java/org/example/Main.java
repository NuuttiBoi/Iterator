package org.example;

import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    FibonacciSequence fibonacciSequence = new FibonacciSequence();
    fibonacciSequence.generateFibonacciNumbers(10);
    Iterator<Integer> iterator = fibonacciSequence.iterator();

    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}