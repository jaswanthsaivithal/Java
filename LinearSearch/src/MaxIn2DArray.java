import java.util.Scanner;

public class MaxIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        /*for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }*/
        System.out.println(Max2D(arr));
    }
    static int Max2D(int[][] arr)
    {
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] > ans)
                {
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}
 // if u want min value change 31 line as arr[i][j] < ans