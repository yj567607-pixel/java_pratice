package OOps_concept;
import java.util.Scanner;
class Bank {
    String CustomerName;
    double Balance;

    Bank(String name, double ba) {
        CustomerName = name;
        Balance = ba;
    }
}
    class SavingAccount extends Bank{

        SavingAccount(String name,double ba){
            super (name,ba);
        }

        void deposite(double amount){

            Balance = Balance+amount;
            System.out.println("Deposite amount = "+ amount);

        }

        void Withdraw(double amount){
            Balance = Balance-amount;
            System.out.println("withdraw amount = "+amount);
        }

        void showBalance(){
            System.out.println("customer name = "+CustomerName);
            System.out.println("current balance = "+Balance);
        }
    }


public class Implement_Inhe_Q {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("enter customer Name =" );
        String Name =sc.nextLine();

        System.out.println("enter balance");
        double ba = sc.nextInt();

        SavingAccount sa1 = new SavingAccount(Name,ba);

        System.out.println("deposite amount =");
        double depositAmount = sc.nextDouble();
        sa1.deposite(depositAmount);
        System.out.println("enter withraw amount = ");
        double withdrawAmount = sc.nextDouble();
        sa1.Withdraw(withdrawAmount);

       sa1.showBalance();
    }
}
