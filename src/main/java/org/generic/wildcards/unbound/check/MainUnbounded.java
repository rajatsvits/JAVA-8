package org.generic.wildcards.unbound.check;

import java.util.ArrayList;
import java.util.List;

public class MainUnbounded {

  public static void main(String[] args) {
//    Z<Integer> a = new Z<Integer>();
//    List x = new ArrayList<>() ;
//    x.add("abc");
//    x.add(1);
//    Object y = a.xyz(x);
//    System.out.println(y);
//
//    List z = new ArrayList<>() ;
//    z.add("abc");
//    z.add(1);
//    Object v = a.abc(z);
//    System.out.println(v);
    A a = new A();
    a.add(new UnboundedQuestion<Y>());
    a.add(new UnboundedQuestion<Z>());




  }
}
