import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1, 4, 7, 11, 10, 9, 8, 6}; //here array starts from 1 so we took i == arr[i] -1 or correct = arr[i] - 1
        Out(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Out(int [] arr)
    {                                                        // another method
        for (int i = 0; i < arr.length; i++)                //int i = 0;
        {                                                   //while (i < arr.length)
            if(i == arr[i] - 1)                             // { int correct = arr[i] - 1;
            {                                               // if (arr[i] != arr[correct]{
                continue;                                   // swap(arr, i , correct);}
            }                                               // else{ i++}
            else
            {
                int k = arr[i] - 1;
                int temp;
                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }
}