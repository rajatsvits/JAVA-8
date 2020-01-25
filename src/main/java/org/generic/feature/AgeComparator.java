package org.generic.feature;

import java.util.Comparator;
import org.generic.Person;

public class AgeComparator implements Comparator<Person> {

  //Note : To reverse the sorting just multiply by -1
//  @Override
//  public int compare(Person o1, Person o2) {
//    final int compare = Integer.compare(o1.getAge(), o2.getAge());
//    return -1*compare;
//  }
  @Override
  public int compare(Person o1, Person o2) {
    final int compare = Integer.compare(o1.getAge(), o2.getAge());
    return compare;
  }
}
