package OOps_concept;
import java.util.Scanner;

interface Payment{
    void PayAmount();
}

class GooglePay implements Payment{
    public void PayAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the pay price = ");
        int price = sc.nextInt();

        System.out.println("enter quantity amount = ");
        int quantity = sc.nextInt();

         int finalamount =price*quantity;
        System.out.println("final amount = "+finalamount);

    }
}

public class interface_Cal_Payment {
    static void main(String[] args) {
        GooglePay gp1 = new GooglePay();
        gp1.PayAmount();
    }
}
