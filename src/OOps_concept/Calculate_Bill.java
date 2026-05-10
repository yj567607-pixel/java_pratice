package OOps_concept;

class product{
    String productName;
    int price;
    int quantity;

    product(String name){
        productName = name;
        System.out.println("product name = "+productName);

    }

    product(String name,int p){
        productName = name;
        price = p;
        System.out.println("product price = "+price);

    }

    product(String n, int p, int q){
        productName = n;
        price = p;
        quantity = q;
    }

    void calculatebill(){
        int Bill = quantity*price;
        System.out.println("product name = " +productName);
        System.out.println("product price = " +price);
        System.out.println("product quantity = " +quantity);
        System.out.println("final bill = "+Bill);

    }

        }

public class Calculate_Bill {
    public static void main(String[] args) {
        product p = new product("laptop");
        System.out.println();

        product p1 = new product("watch",2000);
        System.out.println();

        product p2 = new product("mobile",2300,2);
        System.out.println();
        p2.calculatebill();

    }
}
