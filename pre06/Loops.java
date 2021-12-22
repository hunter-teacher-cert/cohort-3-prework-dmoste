import java.io.*;
import java.util.*;

public class Loops{
	public static double power(double x, int n){
		double result = x;
		
		for(int i = 1; i < n; i++){
			result = result * x;
		}
		
		return result;
	}
	
	public static double factorial(double n){
		double result = 1;
		
		for(double i = n; i > 1; i--){
			result = result * i;
		}
		
		return result;
	}
	
	public static double myexp(double x, int n){
		double result = 1;
		double priorNum = 1;
		double priorDen = 1;
		
		for(int i = 1; i <= n; i++){
			double numerator = priorNum*x;
			double denominator = priorDen*i;
			
			result = result + (numerator/denominator);
			
			priorNum = numerator;
			priorDen = denominator;
		}
		
		return result;
	}
	
	public static void check(double x){
		System.out.println(x + "\t" + myexp(x, 17) + "\t" + Math.exp(x));
	}
	
	public static void main(String[] args){
		double x = power(4.0,3);
		System.out.println(x);
		
		double y = factorial(7);
		System.out.println(y);
		
		double z = myexp(4.0,10);
		System.out.println(z);
		
		for(int i = -1; i < 3; i++){
			double a = Math.pow(10, i);
			
			check(a);
		}
		
		for(int i = -1; i < 3; i++){
			double a = -Math.pow(10, i);
			
			check(a);
		}
	}
}