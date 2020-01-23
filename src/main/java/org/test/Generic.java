//package org.test;
//
//import java.util.List;
//
//public class Generic<T> {
//
//  public static  <T> int count (List<T> item, T x){
//    int count=0,size=item.size();
//    for(int i=0;i<size;i++){
//      boolean y= compare(item.get(i),x);
//
//      if(y)
//        count++;
//      System.out.println(i+" "+count+" "+y+" "+item.get(i)+" "+x);
//    }
//    return count;
//  }
//
////  private static <T> boolean compare(T t, T x) {
////
////    return t.compareTo(x)?false:true;
////  }
//}
