descripcion :
visualizar el recorrido por los grafos

Depth First Search
La profundidad de primer recorrido (o búsqueda) para un gráfico es similar a la profundidad de primer recorrido de un árbol. El único inconveniente aquí es que, a diferencia de los árboles, los gráficos pueden contener ciclos, un nodo puede visitarse dos veces. Para evitar procesar un nodo más de una vez, use una matriz visitada booleana.

Breadth-First Traversal 
El recorrido primero en anchura (o búsqueda) de un gráfico es similar al recorrido en anchura primero de un árbol (consulte el método 2 de esta publicación). El único inconveniente aquí es que, a diferencia de los árboles, los gráficos pueden contener ciclos, por lo que podemos volver al mismo nodo nuevamente. Para evitar procesar un nodo más de una vez, usamos una matriz visitada booleana. Para simplificar, se supone que todos los vértices son accesibles desde el vértice inicial.

complejidad en Depth First Search
O (V + E), donde V es el número de vértices y E es el número de aristas en el gráfico.

complejidad en Breadth First Search
Complejidad de tiempo: O (V + E) donde V es un número de vértices en el gráfico y E es un número de aristas en el gráfico.
