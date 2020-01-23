package org.test;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

  /*
   * Enter your code here. Read input from STDIN. Print your output to STDOUT.
   * Your class should be named CandidateCode.
   */

  private int V;   // No. of vertices
  private int depthCount=1;
  private int parent;
  // Array  of lists for Adjacency List Representation
  private LinkedList<Integer> adj[];
  int a[] ;
//  private LinkedList<Integer> depth = new LinkedList();
  private LinkedList<Integer> level = new LinkedList();
  // Constructor
  Ideone(int v)
  {
    V = v;
    a = new int[V];
    adj = new LinkedList[v];
    for (int i=0; i<v; ++i)
      adj[i] = new LinkedList();
  }

  //Function to add an edge into the graph
  void addEdge(int v, int w)
  {
    adj[v].add(w);  // Add w to v's list.
  }

  // A function used by DFS
  void DFSUtil(int v,boolean visited[])
  {
    // Mark the current node as visited and print it
    if(visited[v] == false ){
//      System.out.print("\nDepth level: "+v);
      a[v]=depthCount++;
//      depth.add(depthCount++);
      level.add(parent);
      //System.out.print("\nDepth level: "+depth);
    }
    visited[v] = true;
    System.out.print((v+1)+" ");

    // Recur for all the vertices adjacent to this vertex
    Iterator<Integer> i = adj[v].listIterator();
    while (i.hasNext())
    {
      int n = i.next();
      if (!visited[n])
        DFSUtil(n, visited);
    }
  }

  // The function to do DFS traversal. It uses recursive DFSUtil()
  void DFS(int v)
  {
    // Mark all the vertices as not visited(set as
    // false by default in java)
    boolean visited[] = new boolean[V];
    DFSUtil(v, visited);
    // Call the recursive helper function to print DFS traversal
    //  System.out.println("\nNumber of component: ");
    int component=1;
    for(int i=0;i<V;i++){
      if(visited[i]==false){
        component++;
        parent=i+1;
        System.out.println();
        DFSUtil(i, visited);
      }
    }
    extra(component);
  }

  void extra(int component){
    System.out.println("\nNumber of component: "+component);
    System.out.print("\nDepth level: ");
    for(int i=0;i<V;i++){
      System.out.print(a[i]+" ");
    }
    System.out.print("\nParent level: ");
    for(int i=0;i<V;i++){
      System.out.print(level.get(i)+" ");
    }

  }

  void check(int n,int m){
    int count=0;
    for(int i=0;i<n;i++){
      if(level.get(i)>=a[i]){
          count++;
      }
    }
    System.out.print("\nBiconnected points: "+count);
  }


  public static void main(String args[] ) throws Exception {

    //Write code here

    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Ideone g = new Ideone(n);
    for(int i=0;i<m;i++){
      int x = sc.nextInt()-1;
      int y = sc.nextInt()-1;
      g.addEdge(x, y);
    }

    System.out.println("Following is Depth First Traversal "+
        "(starting from vertex 1)");
    g.parent =1;
    g.DFS(0);

    g.check(n,m);
  }
}
