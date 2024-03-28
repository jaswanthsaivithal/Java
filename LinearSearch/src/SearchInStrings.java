public class SearchInStrings {
    public static void main(String[] args) {
        String name = "amlemflzaiuhfniusnfxdufbdufb";
        char target = 'y';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
        int[] arr = {1, 3, 4, 34, 5, 32, 522, 211};
        int target1 = 5;
        System.out.println(linearSearch(arr, target1, 1, 6));
    }


    static boolean search(String str, char target) {
        if (str.length() == 0) { //we can write str.length() == 0 as str.isEmpty()
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) // if you want a character in a particular string you can use this function
            {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) // toCharArray is used to change string to char array
        {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static int linearSearch(int[] arr, int target1, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target1) {
                return index;
            }
        }
        return -1;
    }
}
