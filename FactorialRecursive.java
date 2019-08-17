import java.util.*;

public class FactorialRecursive{
  public static void main(String... args){
    int n=5;
    System.out.println("factorial of "+ n +" is "+ CalculateRecursion(n));

  }

  private static int CalculateRecursion(int n){
    if(n==1){return 1;}
    return n*CalculateRecursion2(n-1);
  }

  private static int CalculateRecursion2(int n){
    int factorial=1;
    for(int i=n;i>=1;i--){
      factorial*=i;
    }

    return factorial;
  }

}
