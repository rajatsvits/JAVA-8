package org.generic.erasure;

import java.util.List;

public class Overload {

  public void print(int param){

  }
  public void print(String param){

  }

//  Below we can have both List<Integer> and List<String> because they are false overloading
//  will not work as after compilation they will removed accordingly and in they will look completely
//  same to compiler and hence giving an error.
//  public void print(List<Integer> param){
//
//  }
  public void print(List<String> param){

  }
}
