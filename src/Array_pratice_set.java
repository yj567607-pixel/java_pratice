public class Array_pratice_set {
    static void main(String[] args) {

        //create a array of 5 float and caculate thir sum
        float[]marks = {100.23f,200.34f,300.23f,400.15f,500.34f};

        float sum = 0;
        for(float element:marks){
            sum = sum+element;

        }
        System.out.println("the value of sum the = "+sum);
    }


}
