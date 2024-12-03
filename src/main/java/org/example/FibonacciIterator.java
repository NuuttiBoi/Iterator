package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements java.util.Iterator<Integer> {
  FibonacciSequence fibonacciSequence = new FibonacciSequence();
  Integer[] fibonacciNumbers;
  private int currentPosition;
  public FibonacciIterator(FibonacciSequence fibonacciSequence){
    if (fibonacciSequence == null) {
      throw new IllegalArgumentException("FibonacciSequence cannot be null");
    }
    this.fibonacciSequence = fibonacciSequence;
  }
  @Override
  public boolean hasNext() {
    return currentPosition < 10;
  }

  @Override
  public Integer next() {
    if(currentPosition == 0){
      currentPosition++;
      return 1;
    } else {
      int next = fibonacciSequence.getNextNumber(currentPosition);
      currentPosition++;
      return next;
    }
  }

  @Override
  public void remove() {
    Iterator.super.remove();
  }
}
