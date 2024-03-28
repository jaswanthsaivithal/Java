import java.util.Scanner;

// Start searching from beginning and keep on moving forward until u found the output is known as Linear Search
//Time complexity : best: O(1) //constant; Worst O(N) // N = size of an array
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("");
        System.out.print("Please enter the target value: ");
        int target = in.nextInt();
        linearSearch(arr, target);
        System.out.println("");
        System.out.print("Target location: ");
        System.out.print(linearSearch(arr, target));
    }
    static String linearSearch(int[] arr, int target)
    {
        if (arr.length == 0)
        {
            return "The Given Array is not accepted";
        }

        for (int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if (element == target)
            {
                System.out.println(index);
            }
        }
        return "The Given Value is not available in the Array";
    }
}
