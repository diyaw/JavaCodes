/*
Fibonacci using Binet's equation

This is the fastest way to find f(n) using Binet's algorithm with the following formula
. F(n) = round( Phi^n / √5 ) provided n ≥ 0
*/

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class Fibonacci_Binet{
  public static void main(String[] args) {
    //Scanner scanner= new Scanner(System.in);
  		//long n = scanner.nextLong();
  		//System.out.println(fibBINET(n));
      long n =5;

  		for (long i = 1; i <= n; i++) {
  			System.out.println(fibBINET(i));
  		}

  	}
  	// Calculate the golden ratio (φ) phi and apply the following formula
  	// Fib(n) = φ^n/√5

  	static long fibBINET(long n)
  	 {
  	    double sqrt5 = Math.sqrt(5);
  	    double phi=(1+sqrt5)/2;
        long ans= Math.round((Math.pow(phi, n)/sqrt5));
  	    return ans;
  	 }
  }
