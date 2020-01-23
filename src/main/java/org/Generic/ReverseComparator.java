package org.Generic;

import java.util.Comparator;

//Class created to pass parameter
public class ReverseComparator<T> implements Comparator<T> {

  private final Comparator delegateComparator;

  public ReverseComparator(Comparator<T> delegateComparator) {
    this.delegateComparator = delegateComparator;
  }

  @Override
  public int compare(T o1, T o2) {
    return -1*delegateComparator.compare(o1,o2);
  }
}
