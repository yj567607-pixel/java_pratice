package OOps_concept;
class Car{
    String brand;
    int price;

    void showDetails(){
        System.out.println("car brand = " +brand);
        System.out.println("car price = " +price);
    }
}

public class Day_4_pratice {
  public  static void main(String[] args) {

      Car c2 = new Car();
      c2.brand = "audo";
      c2.price = 2000000;
      c2.showDetails();

    }


}
