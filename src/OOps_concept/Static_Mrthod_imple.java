package OOps_concept;

class sum {

    static void add(int a,int b){
        int result = a+b;
        System.out.println("sum = "+result);

    }

}

public class Static_Mrthod_imple {
    static void main(String[] args) {
        sum.add(12,23);
    }
}
