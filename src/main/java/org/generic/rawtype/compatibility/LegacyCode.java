package org.generic.rawtype.compatibility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode {

  public static void main(String[] args) {
    //Legacy code
    List<Object> list1 = new ArrayList();
    List list = new ArrayList(); // This line of code purely to allow interoperability and
    // compatibility with legacy code
    list.add(1);
    list.add("rajat");
    list.add(new Object());

    List<String> list2 = list;  //This doesn't gives an error.
//    List<String> list2 = list1; //This gives an error.

    //This code is dependent upon legacy api ie code of list on the array list class.
    Iterator iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
