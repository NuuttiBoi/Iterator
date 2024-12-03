package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class FibonacciSequence implements Sequence{
  ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
  Integer[] numberList;
  @Override
  public Iterator<Integer> iterator() {
    return new FibonacciIterator(this);
  }
  public void generateFibonacciNumbers(int numbers) {
    numberList = new Integer[numbers];
    fibonacciNumbers.add(1);
    fibonacciNumbers.add(1);
    numberList[0] = 1;
    numberList[1] = 1;
    for(int i = 2; i < numbers; i++){
      numberList[i] = numberList[i-2] + numberList[i-1];
      fibonacciNumbers.add(numberList[i]);
    }
  }

  public int getNextNumber(int nextPosition) {
    return fibonacciNumbers.get(nextPosition);
  }

}
