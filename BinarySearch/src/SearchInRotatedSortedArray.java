//pivot means largest number. if we finds pivot then it is a sorted array(6,7,8,9,1,2,3,4,5) here 9 is pivot
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target)
    {
        int pivot = FindPivot(arr);
        if (pivot == -1)
        {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        else if (target == arr[pivot])
        {
            return pivot;
        }
        else if (target >= arr[0])
        {
            return binarySearch(arr, target, 0, pivot -1);
        }
        else
        {
            return binarySearch(arr, target, pivot+1, arr.length - 1);
        }

    }
    static int FindPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid-1])
            {
                return mid - 1;
            }
            else if (arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        return - 1;
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
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
