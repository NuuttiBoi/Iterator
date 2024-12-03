package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator {
  FibonacciSequence fibonacciSequence = new FibonacciSequence();
  Integer[] fibonacciNumbers;
  int currentPosition;
  public FibonacciIterator(Integer[] fibonacciNumbers){
    this.fibonacciNumbers = fibonacciNumbers;
    fibonacciSequence.generateFibonacciNumbers(10);
  }
  @Override
  public boolean hasNext() {
    System.out.println("haista vittu");
    return currentPosition < fibonacciNumbers.length-1;
  }

  @Override
  public Integer next() {
    try {
      if (hasNext()) {
        int next_number = fibonacciSequence.getNextNumber(currentPosition);
        currentPosition++;
        System.out.println("Current: " + currentPosition);
        return next_number;
      }
    } catch (NoSuchElementException e){
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public void remove() {
    Iterator.super.remove();
  }
}
