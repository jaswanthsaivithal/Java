import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 9, 0, 3, 7}; //here array starts from 0 so correct = arr[i]
        System.out.println(Out(arr));
    }

    public static int Out(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }



    static void swap(int[] arr, int i, int correct)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
