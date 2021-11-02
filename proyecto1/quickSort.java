package proyecto1;
/* peor caso es O(n^2)
 * mejor caso cuando el pivote es el elemento medio O(nlogn)
 * caso promedio es O(nlogn)
 * 
 * */
public class quickSort {
		   
	static void swap(int[] arr, int i, int j){
		//cambia el elemento de la posicion i por la posicion j
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	  
	/*Esta función toma el último elemento como pivote, coloca
	   el elemento pivote en su posición correcta en ordenados
	   matriz, y coloca todos más pequeños (más pequeños que pivote)
	   a la izquierda del pivote y todos los elementos mayores a la derecha
	   de pivote*/
	static int partition(int[] arr, int low, int high){
	     
	    int pivot = arr[high]; 
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++){
	          
	       if (arr[j] < pivot){
	    	   i++; 
	           swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	  
	static void quickSort(int[] arr, int low, int high){
		//divide el arreglo en 2 y trabaja en subpartes
	    if (low < high){
	    	int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	  
	//imprime arreglo
	static void printArray(int[] arr, int size){
		for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	    System.out.println();
	}
	
	public static void main(String[] args){
		//casos prueba
	    int[] arr = { 10, 9, 8, 7, 6, 5 };
	    int n = arr.length;
	    int arr1[] = { 21,213,4,54,7,641};
	    int nn=arr1.length;
	    
	    quickSort(arr, 0, n - 1);
	    System.out.println("array ordenado por quick sort : ");
	    printArray(arr, n);
	    
	    quickSort(arr1, 0, nn - 1);
	    System.out.println("array ordenado por quick sort : ");
	    printArray(arr1, n);
	}
}
