package OOps_concept;

class Laptop{
    String LaptopName;
    int LaptopPrice;

    Laptop(String name,int price){
        LaptopName = name;
        LaptopPrice = price;

    }

    void LaptopInfo(){
        System.out.println("Laptop all information");
        System.out.println("Laptop name  = " + LaptopName);
        System.out.println("Laptop Price = " +LaptopPrice);
        System.out.println();
    }

}

public class usingCons {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop("dell",2000);
        Laptop lap2 = new Laptop("hp",10000);
        Laptop lap3 =new Laptop ("lenevo",20000);

        lap1.LaptopInfo();
        lap2.LaptopInfo();
        lap3.LaptopInfo();





    }
}
