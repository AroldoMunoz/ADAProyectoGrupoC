package proyecto2;
import java.io.*;
import java.util.*;

class BreadthFirstSearch {
	// Programa Java para imprimir un recorrido BFS desde un v�rtice de origen determinado.
	// BFS (int s) atraviesa v�rtices accesibles desde s.
	// Esta clase representa un gr�fico dirigido usando una lista de adyacencia
	    private int V;   // No. de vertices
	    private LinkedList<Integer> adj[]; //Lista de adyacencia
	 
	    // Constructor
	    BreadthFirstSearch(int v)
	    {
	        V = v;
	        adj = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adj[i] = new LinkedList();
	    }
	 
	    // adiciona elementos en el grafo
	    void addEdge(int v,int w)
	    {
	        adj[v].add(w);
	    }
	 
	    // imprime el recorrido BFS desde una fuente determinada s
	    void BFS(int s)
	    {
	    	// Marcar todos los v�rtices como no visitados (por defecto establecer como falso)
	        boolean visited[] = new boolean[V];
	 
	        // Crea un queue para BFS
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        // Marque el nodo actual como visitado y inserta
	        visited[s]=true;
	        queue.add(s);
	 
	        while (queue.size() != 0)
	        {
	            // Retirar un v�rtice de la cola e imprimirlo
	            s = queue.poll();
	            System.out.print(s+" ");
	 
	            // Obtener todos los v�rtices adyacentes de los v�rtices quitados de la cola s
	            // Si no se ha visitado un adyacente, m�rquelo visitado y ponerlo en cola
	            Iterator<Integer> i = adj[s].listIterator();
	            while (i.hasNext())
	            {
	                int n = i.next();
	                if (!visited[n])
	                {
	                    visited[n] = true;
	                    queue.add(n);
	                }
	            }
	        }
	    }
	 
	   //compilando el programa
	/*    public static void main(String args[])
	    {
	    	BreadthFirstSearch g = new BreadthFirstSearch(4);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("A continuaci�n se muestra la amplitud del primer recorrido "+
	        		"(comenzando desde el v�rtice 2)");
	 
	        g.BFS(2);
	    }
	    */
	}

