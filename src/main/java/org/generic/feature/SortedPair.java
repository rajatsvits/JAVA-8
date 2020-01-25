package org.generic.feature;

//We want to make use of feature known as type bound so we extend comparable  method
// so my compiler know that anything i am passing left/first or right/second is a class that implements
// the comparable interface
public class SortedPair<T extends Comparable<T>> {
  private final T first;
  private final T second;

  public SortedPair(T first, T second) {
    //This is yellow because Comparable is generic so we want to completely safe [if we don't so that we
    // will get ClassCastException] we need to define it so at <T> in Comparable
    if(first.compareTo(second)<0) {
      this.first = first;
      this.second = second;
    }else {
      this.first = second;
      this.second = first;
    }
  }

  public T getFirst() {
    return first;
  }

  public T getSecond() {
    return second;
  }
}
