package OOps_concept;

class Vehicle{
    int speed = 23;
}

class thar extends Vehicle{

}

public class Imple_Inheritance {
    static void main(String[] args) {

        thar th1 = new thar();
        System.out.println("speed = "+th1.speed);

    }
}
