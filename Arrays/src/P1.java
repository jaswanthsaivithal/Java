import java.util.Scanner;

public class P1 {
    public static class Main {
        public static int longestIncreasingChain(int[] arr) {

            int longestChain = 0;

            // Loop through the array and check each element

            for (int i = 0; i < arr.length; i++) {

                int currentElement = arr[i];

                // Calculate the length of the increasing chain starting from the current element

                int chainLength = 1;

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[j] > currentElement) {

                        chainLength++;

                        currentElement = arr[j];

                    } else {

                        break;

                    }

                }

                // Update the longest chain if necessary

                if (chainLength > longestChain) {

                    longestChain = chainLength;

                }

            }

            return longestChain;

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0;i < arr.length; i++)
            {
               arr[i] = in.nextInt();
            }
            System.out.println(longestIncreasingChain(arr));

        }

    }
}
