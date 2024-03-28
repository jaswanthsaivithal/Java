import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 53, 533},
                {223, 43, 2, 9},
                {1212, 21, 34},
                {112, 2121}
        };
        int target = 112;
        int[] ans = Search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search2D(int[][] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (target == arr[i][j])
                {
                    return new int[] {i, j}; // here we use new int to make sure the return needs to know the output value should be array so we are using new int to declare it as array
                }
            }
        }
        return new int[] {-1, -1};
    }
}
