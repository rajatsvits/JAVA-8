package org.comparator;

import java.util.function.Function;

public class MainComparator {

  public static void main(String[] args) {
//    Comparator<Person> cmp = (p1,p2) -> -1;
    Comparator<Person> cmpAge = (p1,p2) -> p2.getAge()-p1.getAge();
    Comparator<Person> cmpFirstName = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
    Comparator<Person> cmpLastName = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());

//    Instead of writing as above we use this function define below
    Function<Person, Integer> f1 = p -> p.getAge();
    Function<Person, String> f2 = p -> p.getFirstName();
    Function<Person, String> f3 = p -> p.getLastName();

//    To call above function we have create a comparing method.
//    Comparator<Person> cmpPerson = Comparator.comparing(f1);
//    its same
    Comparator<Person> cmpPerson1 = Comparator.comparing(p -> p.getAge());
    Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
    Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);

    Comparator<Person> cmp = Comparator.comparing(Person::getLastName)
        .thenComparing(Person::getFirstName).thenComparing(Person::getAge);

  }
}
