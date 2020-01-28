package org.generic.erasure;

public class InstanceOf<T> {
  public boolean equals(Object o){
    if(o instanceof InstanceOf){
      return true;
    }
    return  false;
  }

//  //This gives error
//  public boolean equal(Object o){
//    if(o instanceof InstanceOf<T>){
//      return true;
//    }
//    return  false;
//  }
}
