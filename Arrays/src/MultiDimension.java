import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        */
       // int[][] arr = new int[3][1]; it is not mandatory to include column number but we must include row number
        /*int[][] arr = {
                {1, 2, 3},
                {4, 5, 7},
                {6, 7, 8}
        };*/
        /*int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
                // we can write an array as abve like just while declaring just giving row number and while initialzing u can change acc to the number of objects needed in it.
                so it is not mandatory for declaring size of column

        };*/
        Scanner in = new Scanner(System.in);
        int[][] arr= new int[3][3];
        System.out.println(arr.length);
        int row;
        int col;
        for (row = 0; row< arr.length; row++)
        {
            for (col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        // output way 1
        /*for (row = 0; row< arr.length; row++)
        {
            for (col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/
        //output way 2
        for (row = 0; row < arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
