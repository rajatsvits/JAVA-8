package org.generic.erasure;

public class ExceptionTest/*<T>*/ extends Exception {

  //IF we run this we will create exception and we will catch it but we remove the commented code you will get error saying throwable can't be used with generic  and it is all because erasure
  public static void main(String[] args) {
    try {
      throw new ExceptionTest();
    }
    catch (ExceptionTest/*<Integer>*/  exceptionTest) {
      exceptionTest.printStackTrace();
    }
  }
}
