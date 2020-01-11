package org.comparator;

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

//  static Comparator<Person> comparing(Function<Person, String> f) {
//    return (p1,p2) -> f.apply(p2)-f.apply(p1);
//  }

//  static Comparator<Person> comparing(Function<Person, Comparable> f) {
//    return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
//  }

//  Further parametrise Person too
  static <U >Comparator<U> comparing(Function<U, Comparable> f) {
    return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
  }

  public int compare(T t1 , T T2);

  public default Comparator<T> thenComparing(Comparator<T> cmp){
    return (p1,p2)->compare(p1,p1)==0?this.compare(p1,p2):compare(p1,p2);
  }

  public default Comparator<T> thenComparing(Function<T, Comparable> f){
    return thenComparing(comparing(f));
  }
}
