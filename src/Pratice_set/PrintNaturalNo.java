package Pratice_set;
import java.util.Scanner;

public class PrintNaturalNo {
    static void main(String[] args) {


     //print 1 to 10 number
        // int num = 10;
        // for(int i=num;i>=1;i--){
        // System.out.println(i);

// }
     //print all even number in 20
      /*int num = 20;

      for(int i=1;i<=num;i++){
          if(i%2==0){
              System.out.println("even number"+i);
          }
     */


        // print digit of sum
       /* int num = 10;
        int sum = 0;
        for (int i=0;i<=10;i++){
            sum = sum+i;
            System.out.println( "sum = "+sum);
            }
      */


        //factorial program
    /*  int num =10;
      int fact=1;

      for(int i=1;i<=num;i++){
          fact = fact*i;
      }
      System.out.println("factorial = "+ fact);

     */


        // user input factorial program
        System.out.println("enter a number here = ");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        int fact =1;

        for(int i=1;i<=num;i++){
            fact =fact*i;
        }
        System.out.println("factorial = " +fact);


    }

}