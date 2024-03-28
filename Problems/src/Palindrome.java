public class Palindrome {
    public static void main(String[] args) {
        String str = "abcbcba";
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        // if we have null string conditon then take if conditon as null and add the bottom code in null;
        while(start <=end) // for(int i = 0; i< arr.length/2;i++)
        {
            if(arr[start] == arr[end])
            {
                start++;
                end--;
            }
            else
            {
                ans = -1;
                break;
            }
        }
        if (ans == -1)
        {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }

    }
}
