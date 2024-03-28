public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(Duplicate(arr));
    }

    static int Duplicate(int[] arr)
    {
        int ans = 0;
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0; j< arr.length; j++)
        {
            if(j != arr[j] - 1)
            {
                ans = arr[j];
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int correct)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
