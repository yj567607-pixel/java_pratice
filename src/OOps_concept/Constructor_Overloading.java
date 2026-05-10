package OOps_concept;

class car {

    String name;
    int model;


    car() {
        System.out.println("default constructor");
    }

    car(String name, int model) {
        System.out.println("car name = " + name);
        System.out.println("car model = " + model);
    }

}

public class Constructor_Overloading {
   public static void main(String[]args) {
               car c1 = new car();
               car c2  = new car("bmw",2027);
    }
}
