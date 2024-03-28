import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
        int[] arr = new int[5];
        arr[0] = 13;
        arr[1] = 33;
        arr[2] = 55;
        arr[3] = 34;
        arr[4] = 23;
        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int num : arr){
            System.out.print(num + " ");
        }*/
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++ )
        {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        String[] str = new String[n];
        for (int i = 0; i<n; i++)
        {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[2] = "JSV";
        System.out.println(Arrays.toString(str));    }
}
