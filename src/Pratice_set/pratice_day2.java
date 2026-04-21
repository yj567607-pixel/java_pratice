package Pratice_set;

public class pratice_day2 {
    public static void main(String[] args){
//   write a program num = 10;
        //expected ouput
        // 2
        //44
        //666
        //8888
        //1010101010
        int num = 10;
        for(int i=2; i<=num; i=i+2){
            for (int j=1;j<=i/2; j++){

                System.out.print(i);
            }
            System.out.println();
        }

    }
}
