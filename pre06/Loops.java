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
	
	public static double squareRoot(double a){
		double initial_guess = a/2;
    double new_guess = 1;
		
		for(int i = 1; i <= 10; i++){
			new_guess = (initial_guess + (a/initial_guess))/2;
			
			initial_guess = new_guess;
		}
		
		return new_guess;
	}
	
	public static void main(String[] args){
		double x = power(4.0,3);
		System.out.println(x);
		
		double y = factorial(7);
		System.out.println(y);
		
		double z = squareRoot(9);
		System.out.println(z);
	}
}