package Pratice_set;
import java.util.Scanner;

public class PrintNaturalNo {
  static void main(String[] args) {

       // int num = 10;
       // for(int i=10;i>=1;i--){
           // System.out.println(i);

// }

      /*int num = 20;

      for(int i=1;i<=num;i++){
          if(i%2==0){
              System.out.println("even number"+i);
          }
     */
       /* int num = 10;
        int sum = 0;
        for (int i=0;i<=10;i++){
            sum = sum+i;
            System.out.println( "sum = "+sum);
            }
      */
    /*  int num =10;
      int fact=1;

      for(int i=1;i<=num;i++){
          fact = fact*i;
      }
      System.out.println("factorial = "+ fact);

     */
      System.out.println("enter a number here = ");
      Scanner sc =new Scanner(System.in);
      int num =sc.nextInt();

      int fact =1;

      for(int i=1;i<=num;i++){
          fact =fact*i;
      }
      System.out.println("factorial = " +fact);

      System.out.println("hello");
   }

}

