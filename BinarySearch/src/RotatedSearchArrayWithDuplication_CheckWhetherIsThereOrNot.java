public class RotatedSearchArrayWithDuplication_CheckWhetherIsThereOrNot {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,2,3,4};
        int target = 2;
        System.out.println(Search(arr,target));
    }

    static boolean Search(int[] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return true;
        }
        return false;
    }

}
