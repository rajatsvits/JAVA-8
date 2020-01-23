//package org.predicate;
//
//public class Main {
//
//  public static void main(String[] args) {
//    Predicate<String> p1 = s -> s.length()<20;
//    Predicate<String> p2 = s -> s.length()>4;
//    boolean r = p1.test("Hello");
//    System.out.println("Hello is shorter than 20 char: "+r);
//
//    //And Method
//    System.out.println("\nAnd Method: ");
//    Predicate<String> p3 = p1.and(p2);
//    System.out.println("P3 value: "+p3);
//    System.out.println("P3 for Yes: "+p3.test("Yes"));
//    System.out.println("P3 for rajat: "+p3.test("rajat"));
//    System.out.println("P3 for Good Morning rajat: "+p3.test("Good Morning rajat"));
//
//    //Or Method
//    Predicate<String> p4 = p1.or(p2);
//    System.out.println("\nOr Method: ");
//    System.out.println("P4 value: "+p4);
//    System.out.println("P4 for Yes: "+p4.test("Yes"));
//    System.out.println("P4 for rajat: "+p4.test("rajat"));
//    System.out.println("P4 for Good Morning rajat: "+p4.test("Good Morning rajat"));
//
//    //Compare Pattern
//    String FixedString = "Yes";
//    Predicate<String> p5 = Predicate.isEqualTo(FixedString);
//    System.out.println("\nEqualTo Method: ");
//    System.out.println("P5 value: "+p5);
//    System.out.println("P5 for Yes: "+p5.test("Yes"));
//    System.out.println("P5 for No: "+p5.test("No"));
//    System.out.println("P5 for YES "+p5.test("YES"));
//
//    //Generic Compare Pattern
//    int FixedInteger = 1;
//    Predicate<Integer> p6 = Predicate.isEqualTo(FixedInteger);
//    System.out.println("\nEqualTo Method: ");
//    System.out.println("P6 value: "+p6);
//    System.out.println("P6 for Yes: "+p6.test(2));
//    System.out.println("P6 for No: "+p6.test(1));
//    System.out.println("P6 for YES "+p6.test(0));
//
//  }
//}
