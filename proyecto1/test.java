package proyecto1;

public class test {
	static void printArray(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();	
	}
	public static void main(String args[]){
		//casos prueba
		int arr[] = { 21,213,4,54,7,641};
	    int arr1[] = { 10, 9, 8, 7, 6, 5 };
	    //heapsort
		heapSort ob = new heapSort();
		heapSort ob1 = new heapSort();
		
	    ob.sort(arr);
	    System.out.println("Ordenamiento Sorted es: ");printArray(arr);
	    ob1.sort(arr1);
	    System.out.println("Ordenamiento Sorted es: ");printArray(arr1);
	    
	    //quicksort
	    quickSort obq1 = new quickSort();
	    quickSort obq2 = new quickSort();
	    obq1.quickSort(arr, 0, arr.length - 1);
	    System.out.println("array ordenado por quick sort : ");printArray(arr);
	    obq2.quickSort(arr1, 0, arr1.length - 1);
	    System.out.println("array ordenado por quick sort : ");printArray(arr1);
	    
	    //insertion sort
	    insertionSort obi = new insertionSort();
	    insertionSort obi1 = new insertionSort();
	    ob.sort(arr);
	    System.out.println("Ordenamiento insetionSort es: ");printArray(arr);
	    ob1.sort(arr1);
	    System.out.println("Ordenamiento insetionSort es: ");printArray(arr1);
	    
	}

}
