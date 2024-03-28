import java.util.Scanner;

public class Max{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i< 5; i++)
        {
            arr[i] = in.nextInt();
        }
        //int[] arr = {1, 3, 5, 66, 2};
        System.out.println(maxi(arr));
    }
    static int maxi(int[] arr)
    {
        int maxVal = arr[0];
        for (int i = 0; i< arr.length; i++)
        {
            if (arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxirange(int[] arr, int start, int end)
    {
        int maxval = arr[0];
        for (int i = start; i < end; i++)
        {
            if (arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }


}
