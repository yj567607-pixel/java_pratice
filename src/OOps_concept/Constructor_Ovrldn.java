package OOps_concept;

class BankAccount{
    String customerName;
    int AccountNumber;
    double Balance;

    BankAccount(String n){
        customerName=n;
        System.out.println("customer name = "+customerName);
    }

    BankAccount(String n,int ac){
        customerName = n;
        AccountNumber =ac;
        System.out.println("customer name = " + customerName);
        System.out.println("Account number = "+AccountNumber);

    }

    BankAccount(String n,int ac,double b){
        customerName = n;
        AccountNumber = ac;
        Balance =  b;

    }

    void calculateinterest(){
        double interest =(Balance*5*4)/100;
        double finalAmount = Balance+interest;

        System.out.println("customer Name = "+customerName);
        System.out.println("Balance = "+Balance);
        System.out.println("total interest = "+interest);
        System.out.println("final amount = "+finalAmount);

    }
}

public class Constructor_Ovrldn {
    public static void main(String[] args) {
        BankAccount Ba1= new BankAccount("indra kumar");
        System.out.println();

        BankAccount Ba2 = new BankAccount("indra kuamr",10101233);
        System.out.println();

        BankAccount ac3 = new BankAccount("indra kuamr",10101233,100000);
        System.out.println();

        ac3.calculateinterest();

    }
}
