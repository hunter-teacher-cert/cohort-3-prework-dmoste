import java.io.*;
import java.util.*;

public class Seive{
  public static boolean[] sieve(int n){
    boolean[] primes = new boolean[n];
    Arrays.fill(primes, Boolean.TRUE);

    for(int i = 2; i < n; i++){
      if(primes[i] == true){
        System.out.printf("i is %d", i);
        for(int j = i*i; j < n; j = j+i){
          System.out.printf("j is %d", j);
          primes[j] = false;
        }
      }
    }

    return primes;
  }
  public static void main(String[] args){
    boolean[] primes = sieve(10);
    System.out.println(Arrays.toString(primes));
  }
}