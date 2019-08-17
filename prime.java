import java.util.*;

public class prime{
  public static void main(String[] args) {
    int n=5;
    boolean ans= isPrime(n);

    if(ans==true){
      System.out.println("is prime");
    }else{
      System.out.println("is not prime");
    }
  }

  public static boolean isPrime(int n){
    if((n>2 && n%2==0) || n==1){
      return false;
    }
    for(int i=3;i<=(int)Math.sqrt(n);i+=2){
      if(n%i==0){
        return false;
      }
    }
    return true;

  }
}
