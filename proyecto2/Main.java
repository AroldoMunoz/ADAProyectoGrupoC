package proyecto2;

public class Main {
	
	public static void main(String args[]) {
		//usando DepthFirstSearch
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
	     
	     //usando  BreadthFirstSearch
	     BreadthFirstSearch h = new BreadthFirstSearch(4);
		 
	     h.addEdge(0, 1);
	     h.addEdge(0, 2);
	     h.addEdge(1, 2);
	     h.addEdge(2, 0);
	     h.addEdge(2, 3);
	     h.addEdge(3, 3);
	 
	     System.out.println("A continuación se muestra la amplitud del primer recorrido "+
	        		"(comenzando desde el vértice 2)");
	 
	     h.BFS(2);
	 }

}
