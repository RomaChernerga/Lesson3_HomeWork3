package ClassWork;

public class L3_Massives {

    public static void main (String[] args){

       // int [][] arr = new int[3][3];
       // arr[0][0] = 1;
       // arr[1][1] = 1;
       // arr[2][2] = 1;
     //   arr[0][2] = 1;
       // arr[2][0] = 1;

       // System.out.println(arr);
        int [][] arr2d = {
                {1, 0 , 1},
                {0, 1 , 0},
                {1, 0 , 1}
        };
        print2dArray(arr2d);


    }

     static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++){
            for ( int x = 0; x<arr[y].length; x++){
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }


}
