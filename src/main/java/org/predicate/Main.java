package org.predicate;

public class Main {

  public static void main(String[] args) {
    Predicate<String> p1 = s -> s.length()<20;
    Predicate<String> p2 = s -> s.length()>4;
    boolean r = p1.test("Hello");
    System.out.println("Hello is shorter than 20 char: "+r);
    Predicate<String> p3 = p1.and(p2);

    System.out.println("P3 value: "+p3);
    System.out.println("P3 for Yes: "+p3.test("Yes"));
    System.out.println("P3 for rajat: "+p3.test("Yes"));
    System.out.println("P3 for Good Morning rajat: "+p3.test("Yes"));
  }
}
