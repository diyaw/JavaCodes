import java.util.*;

public class FactorialLoop{
  public static void main(String... args){

    int n=5;

    System.out.println("factorial of "+ n +" is "+ CalculateLoop(n));
  }

  private static int CalculateLoop(int n){
    int factorial=1;
    for(int i=n;i>=1;i--){
      factorial*=i;
    }

    return factorial;
  }
}
