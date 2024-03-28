import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-10, 23, -1, 24, 4, 33};
        SelectionS(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionS(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int last = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr, 0, last);
            swap(arr, MaxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = start; i <= end; i++)
        {
            if (arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }

}
