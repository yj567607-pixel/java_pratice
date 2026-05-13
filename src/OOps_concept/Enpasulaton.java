package OOps_concept;

class MyBankAccount{

   private String  holderName;
   private int Balance;

   void setholderName(String name){
       holderName = name;
   }

   void setBalance(int ba){
       Balance =ba;
   }

    String getholderName(){
       return holderName;
    }

    int getBalance(){
       return Balance;
    }

    void Deposite (int amount){
        Balance = amount+Balance;
        System.out.println("deposite amount = "+amount);
    }
}

public class Enpasulaton {
    static void main(String[] args) {
        MyBankAccount Ac1 = new MyBankAccount();
        Ac1.setholderName("indra");
        Ac1.setBalance(10000);
        Ac1.Deposite(1000);

        System.out.println("account holder name = "+Ac1.getholderName());
        System.out.println("balance = "+Ac1.getBalance());
    }
}
