import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        System.out.println(Arrays.toString(search(arr, 14)));

    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target)
    {
        while (cStart <= cEnd)
        {
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] == target)
            {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target)
            {
                cStart = mid+1;
            }
            else {
                cStart = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious matrix may be empty
        if (rows == 1)
        {
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart  = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;
        //run the loop till 2 rows remaining
        while (rStart < (rEnd-1))
        {
            int mid = rStart + (rEnd - rStart)/2;
            if (matrix[mid][cMid] < target)
            {
                rStart = mid;
            }
            else
            {
                rEnd = mid;
            }
        }
        // now we have two rows
        //check whether the target is in the col of 2rows
        if(matrix[rStart][cMid] == target)
        {
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target)
        {
            return new int[]{rStart+1, cMid};
        }
        //search in 1st half
        if(target <= matrix[rStart][cMid-1])
        {
            return binarySearch(matrix, rStart, 0,cMid -1,target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1])
        {
            return binarySearch(matrix, rStart,cMid+1, cols-1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart+1][cMid-1])
        {
            return binarySearch(matrix, rStart+1,0, cMid-1, target);
        }
        //search in 4th half
        else
        {
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }

    }
}
