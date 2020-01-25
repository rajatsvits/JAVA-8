package org.generic.feature;

import static java.util.Collections.min;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.generic.Person;

public class SortingExample<T> {

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

    final Person youngestBrother = min(brothers, new AgeComparator());
    System.out.println("Youngest brother "+youngestBrother);
    final Person youngestBrother2 = (Person) min1(brothers, new AgeComparator());
    System.out.println("Youngest brother mycode: "+youngestBrother);
//    We have deleted the cast because we have changed the return type form Object ot T
    final Person youngestBrother3 = min1(brothers, new AgeComparator());
    System.out.println("Youngest brother Generic: "+youngestBrother);

    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(3);
    integers.add(2);
    System.out.println("Generic min method for integer: "+min(integers,Integer::compareTo));
  }

  private static <T> T min1(List<T> values, Comparator<T> comparator) {
    if(values.isEmpty()){
      throw new IllegalArgumentException("List is empty");
    }

    T lowestElement = values.get(0);
    for(int i=1;i<values.size();i++){
      if(comparator.compare(lowestElement,values.get(i))<0){
        lowestElement=values.get(i);
      }
    }
    return lowestElement;
  }
}
