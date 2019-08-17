/* display number from 1 to 100 but every number divisible by 3 should print Fizz
and every number divisible by 5 should print Buzz
*/
import java.util.*;

public class FizzBuzz{
  public static void main(String... args){
    for(int i=1;i<=100;i++){
      if(i%3==0 && i%5==0){
        System.out.println("FizzBuzz");
      }else if(i%5==0 && i%3!=0){
        System.out.println("Buzz");

      }else if(i%3==0 && i%5!=0 ){
        System.out.println("Fizz");

      }else{
        System.out.println(i);

      }
    }
  }
}
