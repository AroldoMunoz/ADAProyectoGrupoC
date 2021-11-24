package proyecto2;

import java.io.*;
import java.util.*;
//esta clase represneta un directorio de grafos usando adyacencia, representando en lista


class DepthFirstSearch {
 private int V; // No. de vertices

 // Array  de lists for 
 // Adjacency List Representation
 private LinkedList<Integer> adj[];

 // Constructor
 @SuppressWarnings("unchecked") DepthFirstSearch(int v)
 {
     V = v;
     adj = new LinkedList[v];
     for (int i = 0; i < v; ++i)
         adj[i] = new LinkedList();
 }

 // Function adiciona un edge en el grafo
 void addEdge(int v, int w)
 {
     adj[v].add(w); // Add w to v's list.
 }

 // una funcion usada por DFS
 void DFSUtil(int v, boolean visited[])
 {
     // Marque el nodo actual como visitado e imprímalo
     visited[v] = true;
     System.out.print(v + " ");

     // Se repite para todos los vértices adyacentes a este vértice
     
     Iterator<Integer> i = adj[v].listIterator();
     while (i.hasNext()) 
     {
         int n = i.next();
         if (!visited[n])
             DFSUtil(n, visited);
     }
 }

 // La función hace un recorrido recurssivo DFSUtil ()
 void DFS(int v)
 {
	// Marca todos los vértices como no visitado (establecido como falso por defecto en java)
     boolean visited[] = new boolean[V];

  // Llamar al ayudante recursivo, función para imprimir DFS el recorrido
     DFSUtil(v, visited);
 }

 // compilado el programa
 public static void main(String args[]) {
	 DepthFirstSearch g = new DepthFirstSearch(4);

     g.addEdge(0, 1);
     g.addEdge(0, 2);
     g.addEdge(1, 2);
     g.addEdge(2, 0);
     g.addEdge(2, 3);
     g.addEdge(3, 3);

     System.out.println("Lo que sigue es el primer recorrido en profundidad"
             + "(comenzando desde el vértice 2)");
         
     g.DFS(2);
 }

}
