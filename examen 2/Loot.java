package prueba;
import java.util.Scanner;

public class Loot {

	public static double getOptimalValue(int capacity, int[] values, int[] weights) {
    	if(capacity == 0 || values == null || weights == null){
    		return 0;
    	}
    	double value = 0;
        double[] weightValueRatio = new double[values.length];
        for(int i = 0; i < values.length; i++){
        	weightValueRatio[i] = values[i]/weights[i];
        }
        
        int i = 0;
        while(capacity > 0 && i < values.length){
        	double max = 0; 
        	int index = 0;
        	for(int j = 0; j < values.length; j++){
        		if(weightValueRatio[j] > max){
        			max = weightValueRatio[j];
        			index = j;
        		}
        	}
        	
        	if(capacity >= weights[index]){
        		capacity = capacity - weights[index];
        		value += values[index];
        		weightValueRatio[index] = 0; 
        	}
        	else{
        		value = (double) values[index] * ((double)capacity/ (double)weights[index]);
        		capacity = 0;
        	}
        }
        return value;
    }  
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 