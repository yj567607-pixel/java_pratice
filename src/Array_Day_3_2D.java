public class Array_Day_3_2D {
    static void main(String[] args) {

        int[][]flat = new int[2][3];
        flat[0][0] = 100;
        flat[0][1] = 101;
        flat[0][2] = 103;
        flat[1][0] = 102;
        flat[1][1] = 107;
        flat[1][2] = 109;

        for (int i=0;i<flat.length;i++){
            for (int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}



