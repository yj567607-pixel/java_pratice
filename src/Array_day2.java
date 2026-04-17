public class Array_day2 {
    static void main(String[] args) {

     //displying the array using for loop
        int[] marks = {23, 22, 34, 32, 22};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        String[] name = {"physics", "vikash", "navjot"};
        for (int i=0; i<name.length; i++) {
            System.out.println(name[i]);


        }
        float[] mark = {22.34f,21.12f,34.32f};
        for (int i=0;i<mark.length;i++){
            System.out.println(marks[i]);
        }

        // printing using for loop reverse order
        System.out.println("printing using for loop reverse order");
        int [] subject_marks = {65,34,334,43,332};
        for (int i=subject_marks.length-1;i>=0;i--) {
            System.out.println(subject_marks[i]);
        }





    }
}
