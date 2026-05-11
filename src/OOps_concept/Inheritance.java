package OOps_concept;

class Animal{
    void eat() {
        System.out.println("animal eat");

    }

    }
    class Dog extends Animal  {

    }

public class Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
      d1.eat();



    }
}
