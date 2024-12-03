package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class FibonacciSequence implements Sequence{
  @Override
  public Iterator<Integer> iterator() {
    return new FibonacciIterator();
  }

  public int getNextNumber(int firstPrevNumber, int secondPrevNumber) {
    return firstPrevNumber + secondPrevNumber;
  }

}
