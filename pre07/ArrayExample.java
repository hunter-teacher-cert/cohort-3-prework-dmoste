import java.io.*;
import java.util.*;

public class ArrayExample{
	public static int[] powArray(int[] a, int n){

		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i], n);
		}
		
		return a;
	}
	
	public static double[] histogram(int[] values, int counters){
		int[] counts = new int[counters];
		
		for (int value : values) {
			counts[value]++;
		}
		
		return counts;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		
		int[] x = powArray(a, 2);
		System.out.println(Arrays.toString(x));
	}
}