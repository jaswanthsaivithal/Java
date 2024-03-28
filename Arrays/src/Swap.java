import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 7, 55};
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
        revarr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void revarr(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
}
