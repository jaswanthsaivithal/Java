import java.util.Arrays;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {18, 124, 92, 1764, 98, 1};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for (int num : nums) // for(int num = 0; num< nums.length; num++)
        {
            if (Even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean Even(int num)
    {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    static int digits(int num)
    {
        int count = 0;
        while (num > 0)
        {
            count++;
            num = num/10;
        }
        return count;
    }
    static int digits2(int num) // second way for counting digits
    {
        if (num < 0)
        {
            num = num * -1;
        }
        return (int)(Math.log10(num)) +1;
    }
}
