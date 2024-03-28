//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'i', 'j' , 'm' , 's'};
        char target = 'f';
        System.out.println(SmallestNumber(arr, target));
    }
    static char SmallestNumber(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + ((end - start)/2);
            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

}
