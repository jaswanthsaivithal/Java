import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//google interview question

/*public static void main(String[] args) {
    int[] arr = {1,3,4,2,2};
    System.out.println();

}
 */
public class FindAllMissingElementsInDuplicates {
    public List<Integer> DisappearNumbers(int[] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
            {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] != index+1)
            {
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int i, int correct)
    {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
