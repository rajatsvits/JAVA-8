package org.Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

  public static void main(String[] args) {
    Person rajat = new Person("rajat",24);
    Person shri = new Person("shri",16);
    Person kunj = new Person("kunj",18);

    List<Person> brothers = new ArrayList<>();
    brothers.add(rajat);
    brothers.add(shri);
    brothers.add(kunj);

    System.out.println("List of Brothers: "+brothers);
    Collections.sort(brothers,new AgeComparator());
    System.out.println("List of Brothers after sorting age: "+brothers);
    Collections.sort(brothers, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
      }
    });
    System.out.println("Inbuilt comparator: "+brothers);
    Collections.sort(brothers,new ReverseComparator<>(new AgeComparator()));
    System.out.println("Reverse comparator with parameteriesd: "+brothers);
  }
}
