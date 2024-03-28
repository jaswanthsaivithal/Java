

// Ceiling = smallest element in array greater or equal to target
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(Ceil(arr, target));
    }
    static int Ceil(int[] arr, int target)
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
        return arr[start];
    }
}
