import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,34,43,66,54,332};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    Swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void Swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}