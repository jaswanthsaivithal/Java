public class FindInMountianArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,6,4,3,2};
        int target = 3;
        int ans = FinalSearch(arr, target);
        System.out.println(ans);
    }
    static int FinalSearch(int[] arr, int target)
    {
        int peak = FindPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1)
        {
            return firstTry;
        }
        else
        {
            return binarySearch(arr, target, peak+1, arr.length - 1);
        }
    }
    public static int FindPeak(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        while (start < end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end)
        {
            int mid = start + (end - start)/2;
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
                    else {
                        start = mid + 1;
                    }
                }
                else
                {
                    if (target < arr[mid])
                    {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
            }
        }
        return - 1;
    }
}
