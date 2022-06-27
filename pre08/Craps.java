import java.io.*;
import java.util.*;

public class Craps{
	public static int roll(int a){
    Random random = new Random();

    int value = random.nextInt(a) + 1;
		
		return value;
	}
	
	public static int shoot(int dice, int value){
    int total = 0;
    
    for(int i = 0; i < dice; i++){
      total = total + roll(value);
    }
		
		return total;
	}

  public static void round(){
    int point = shoot(2, 6);
    
    if(point == 2 || point == 3 || point == 12){
      System.out.print("Loss ");
      System.out.println(point);
    } else if(point == 7 || point == 11){
      System.out.print("Win ");
      System.out.println(point);
    } else{
      System.out.print(point);
      int result = 0;
      
      do{
        result = shoot(2, 6);
      } while(result != 7 && result != point);
      
      if(result == 7){
        System.out.print(" Loss ");
        System.out.println(result);
      } else{
        System.out.print(" Win ");
        System.out.println(result);
      }
    }
  }
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
    int rounds;

    System.out.print("How many rounds should we play? ");
		rounds = in.nextInt();

    for(int i = 0; i < rounds; i++){
      round();
    }
	}
}