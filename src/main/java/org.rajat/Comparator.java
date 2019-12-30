package org.rajat;

/*
@author Rajat Mahajan
 */

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

//  It won't work for the string even if we create a string function type it has a same signature method so we have to change it to take both
//  static Comparator<Person> comparing(Function<Person, Integer> f) {
//    return (p1,p2) -> f.apply(p2)-f.apply(p1);
//  }

  static Comparator<Person> comparing(Function<Person, Comparable> f) {
    return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
  }

//  static Comparator<Person> comparing(Function<Person, String> f) {
//    return (p1,p2) -> f.apply(p2)-f.apply(p1);
//  }

  public int compare(T t1 , T T2);
}
