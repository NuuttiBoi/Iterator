package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements java.util.Iterator<Integer> {
  private FibonacciSequence fibonacciSequence = new FibonacciSequence();
  private int currentPosition = 1;
  private int previousPosition = 0;
  private int limit = 10;
  int count = 0;

  @Override
  public boolean hasNext() {
      return count < limit;
  }

  @Override
  public Integer next() {
    int nextPosition = fibonacciSequence.getNextNumber(currentPosition, previousPosition);
    previousPosition = currentPosition;
    currentPosition = nextPosition;
    count++;
    return previousPosition;
  }

  @Override
  public void remove() {
    Iterator.super.remove();
  }
}
