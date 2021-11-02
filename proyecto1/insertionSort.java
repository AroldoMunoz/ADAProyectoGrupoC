package proyecto1;
/*
 * complejidad O(n^2)*/
public class insertionSort {
	
	void sort(int arr[]){
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
	 
			//Mover elementos de arr [0..i-1], que son mayor que la clave, a una posición por
			//delante de su posición actual
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
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
		//casos prueba
		int arr[] ={ 21,213,4,54,7,641};
	    insertionSort ob = new insertionSort();
	    ob.sort(arr);
	    System.out.println("Ordenamiento insetionSort es: ");
	    printArray(arr);
	   
	   
	    
	    int[] arr1 = { 10, 9, 8, 7, 6, 5 };
	    insertionSort ob1 = new insertionSort();
	    ob1.sort(arr1);
	    System.out.println("Ordenamiento insetionSort es: ");
	    printArray(arr1);
	}
}

