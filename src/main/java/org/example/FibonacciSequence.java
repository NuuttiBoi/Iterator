package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class FibonacciSequence implements Sequence{
  ArrayList<Integer> fibonacciNumbers;
  Integer[] numberList;
  @Override
  public Iterator<Integer> iterator() {
    return fibonacciNumbers.iterator();
  }
  public void generateFibonacciNumbers(int numbers) {
    numberList = new Integer[numbers];
    numberList[0] = 1;
    numberList[1] = 1;
    for(int i = 2; i < numbers; i++){
      numberList[i] = numberList[i-2] + numberList[i-1];
      System.out.println("Number" + i + " = " + numberList[i]);
    }
    fibonacciNumbers.addAll(List.of(numberList));
  }

  public int getNextNumber(int nextPosition) {
    return numberList[nextPosition];
  }
}
