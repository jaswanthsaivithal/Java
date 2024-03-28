public class RotatedSearchInArrayWithDuplicate {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,2,3,4};
        int target = 2;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search (int[] arr, int target)
    {
        int Pivot = findingPivot(arr);
        if (Pivot == -1)
        {
            return binary(arr, target, 0, arr.length -1);
        }
        else if (target ==  Pivot)
        {
            return Pivot;
        }
        else if (target >= arr[0]) {
            return binary(arr, target, 0, Pivot -1);
        }
        else
        {
            return binary(arr, target, Pivot+1, arr.length -1);
        }

    }

    static int findingPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid -1])
            {
                return mid - 1;
            }
            else if (arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                //note if any element is in start and end is pivot
                if (arr[start] > arr[start + 1])
                {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (arr[end] < arr[end - 1])
                {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int binary(int[] arr, int target, int start, int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] > target)
            {
                end = mid - 1;
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
