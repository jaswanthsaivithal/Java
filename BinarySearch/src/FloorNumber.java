public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8 , 11, 15, 17, 19};
        int target = 16;
        System.out.println(Floor(arr,target));
    }
    static int Floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + ((end - start)/2);
            if (arr[mid] == target)
            {
                return mid;
            }
            else if(isAsc)
            {
                if(arr[mid] < target)
                {
                    start = mid + 1;
                }
                else if(arr[mid] > target)
                {
                    end = mid - 1;
                }
            }
            else
            {
                if(arr[mid] < target)
                {
                    end = mid - 1;
                }
                else if (arr[mid] > target)
                {
                    start = mid + 1;
                }
            }
        }
        return arr[end];
    }

}
