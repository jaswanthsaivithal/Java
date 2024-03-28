public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int arr[] = {7,2,5,10,8};
        int m = 2;
        int ans = SplitArrays1(arr, m);
        System.out.println(ans);
    }
    static int SplitArrays1(int[] arr, int m)
    {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++)
        {
            start = Math.max(start, arr[i]);// start = max elements in array
            end += arr[i]; // end = sum of elements in array
        }
        while (start < end) // do keep equal sign bcoz at the end output comes while start = end
        {
            //try for the middle as potential ans
            int mid = start + (end - start)/2;
            // calculate how many pieces you can divide in with this max sum
            int sum = 0;
            int piece = 1;
            for (int i = 0; i < arr.length ; i++)
            {
                int num = arr[i];
                if (sum + num > mid)
                {
                    // you cant add this subarray. make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    piece++;
                }
                else
                {
                    sum += num;
                }
            }
            if (piece > m)
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
}
