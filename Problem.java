import java.math.BigInteger;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Num = "        24354300000723872634800236457 0000011111       ";
        String Num1 = Num.trim().replaceAll(" ", "");
        int[] arr = StringToArray(Num1);
        ArrayList<Integer> arr2 = StartFromZero(arr);
        int[] arr3 = new int[arr2.size()];
        for(int i = 0; i<arr2.size(); i++)
        {
            arr3[i] = arr2.get(i);
        }

        //BigInteger FinalOutput = new BigInteger(Arrays.toString(arr3).replaceAll("[\\[\\]]", "").replace(",", "").replace(" ", "").replace("0", ""));
        if (isNumber(Num1))
        {
            System.out.println(FinalOutput(arr3));
        }
        else{
            System.out.println("ERRR");
        }

    }
    static String FinalOutput(int[] arr3)
    {
        String arrayString = "";
        for (int num = 0; num < arr3.length; num++) {
            arrayString += arr3[num]; // Append each element to the string
        }
        return arrayString.replaceAll("-16", "");
    }

    static boolean isNumber(String Num1)
    {
        if (Num1.length() > 0 && Num1.length() <= 200)
        {
            try {

                new BigInteger(Num1);
                return true;
            }
            catch(NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
    static int[] StringToArray(String Num1)
    {
        int[] arr = new int[Num1.length()];
        for (int i = 0; i< Num1.length(); i++)
        {
            char DigiChar = Num1.charAt(i);
            int digit = DigiChar - '0';
            arr[i] = digit;
        }
        return arr;
    }

    static ArrayList<Integer> StartFromZero(int[] arr)
    {
        ArrayList<Integer> arr2 = new ArrayList<>();
        int k = 0;
        for (int i = 0; i< arr.length; i++)
        {
            if (arr[i] == k)
            {
                for (int j = i; j< arr.length; j++)
                {
                    arr2.add(arr[j]);
                }
                break;
            }
        }
        return arr2;
    }

}
