import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Input Array: ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Please Enter the Target Element: ");
        int target = in.nextInt();
        System.out.print("Target Element Index Value: ");
        System.out.print(ObSearch(arr,target));
    }
    static int ObSearch(int[] arr, int target)
    {
       int end = arr.length -1;
       int start = 0;
        //  find whether the given array is ascending or descending
       boolean isAsc = arr[start] < arr[end];
       while (start <= end)
       {
           int mid = start + ((end - start)/2);
           if (arr[mid] == target)
           {
               return mid;
           }
           else
           {
               if (isAsc)
               {
                   if (target < arr[mid])
                   {
                       end = mid - 1;
                   }
                   else if (target > arr[mid])
                   {
                       start = mid + 1;
                   }
               }
               else
               {
                   if (target < arr[mid])
                   {
                       start = mid + 1;
                   }
                   else if (target > arr[mid])
                   {
                       end = mid - 1;
                   }
               }
           }
       }
       return -1;
    }
}
