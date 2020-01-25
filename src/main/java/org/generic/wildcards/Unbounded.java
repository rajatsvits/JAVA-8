package org.generic.wildcards;

import java.util.ArrayList;
import java.util.List;
import org.generic.Person;

public class Unbounded {

  public static void main(String[] args) {
    //This works fine
    List<Object> objects = new ArrayList<>();
    objects.add(new Object());
    objects.add(new Person("rajat",12));
    System.out.println(objects);

//    //This won't work
//    List<?> object = new ArrayList<>();
//    object.add(new Object());
//    object.add(new Person("rajat",12));
//    System.out.println(object);

    //Why any class has restriction:
    Object[] array  = new Person[1];
    array[0] = new Person("rajat",12);
    array[0] = new Object();
    System.out.println(array);
    //If we do this we will get ArrayStorageExecption because of the unsafety of co-variant arrays
    // {using parent class as a reference and subclass as reference}

    //The only value you are going to put in <?> is null
    List<?> object = new ArrayList<>();
    object.add(null);
    System.out.println(object);
    //Because null can be coversed any time.

  }
}
