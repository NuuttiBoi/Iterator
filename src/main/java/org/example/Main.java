package org.example;

import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    FibonacciSequence fibonacciSequence = new FibonacciSequence();
    Iterator<Integer> iterator = fibonacciSequence.iterator();

    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }
}