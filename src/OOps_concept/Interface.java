package OOps_concept;

interface animal{
    void sound();
}

class dog implements animal{
    public void sound(){
        System.out.println("dog bark");
    }
}

public class Interface {
    static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();
    }
}
