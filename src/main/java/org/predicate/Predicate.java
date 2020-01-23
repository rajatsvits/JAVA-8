package org.predicate;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<T>  {

  public boolean test(T t);

  public default Predicate<T> and(Predicate<T> p2){
    return t -> test(t) && p2.test(t);
  }

  public  default Predicate<T> or(Predicate<T> p2){
    return t -> test(t) || p2.test(t);
  }

  //Will compare past string/integer to current constant/Fixed string.
  default Predicate<T> isEqualTo(T s){
    return s1 -> s1.equals(s);
  }
}
