package proyecto1;
//ordenamiento de arreglos heapSort
/* Complejidad de tiempo: La complejidad de tiempo de heapify es O(Logn). 
 * La complejidad de tiempo de Heap () es O (n) y 
 * la complejidad de tiempo general de Heap Sort es O (nLogn).*/
public class heapSort {

	public void sort(int arr[]){
		int n = arr.length;//n es tamaño arreglo
	 
	    for (int i = n / 2 - 1; i >= 0; i--)
	    	heapify(arr, n, i);
	 
	    for (int i = n - 1; i > 0; i--) {
	    	//intercambia el calor de posicion i con el de la pocision 0
	    	int temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;
	        heapify(arr, i, 0);
	    }
	}
	 
	void heapify(int arr[], int n, int i){
		//busca el valor mayor y entre los hijos
		
		int largest = i;
	    int l = 2 * i + 1; 
	    int r = 2 * i + 2; 
	 
	    if (l < n && arr[l] > arr[largest])
	    	largest = l;
	 
	       
	    if (r < n && arr[r] > arr[largest])
	    	largest = r;
	    //intercambia el valor de padre por el hijo mayor
	    if (largest != i) {
	    	int swap = arr[i];
	    	arr[i] = arr[largest];
	    	arr[largest] = swap;
		    heapify(arr, n, largest);
	        }
	}
	 
	   //imprime el arreglo
	static void printArray(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	 
	
	public static void main(String args[]){
		
		//caso prueba
		int arr[] = { 21,213,4,54,7,641};
	    heapSort ob = new heapSort();
	    ob.sort(arr);
	 
	    System.out.println("Ordenamiento Sorted es: ");
	    printArray(arr);
	    
	    int[] arr1 = { 10, 9, 8, 7, 6, 5 };
	    heapSort ob1 = new heapSort();
	    ob1.sort(arr1);
	 
	    System.out.println("Ordenamiento Sorted es: ");
	    printArray(arr1);
	}
	
}


