import java.util.ArrayList;
import java.util.Scanner;

public class bla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        // Adding elements to the ArrayList
        numberList.add(5);
        numberList.add(10);
        numberList.add(15);

        // Input more elements from the user
        System.out.println("Enter integers to add to the ArrayList (enter -1 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numberList.add(num);
        }

        // Printing the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int number : numberList) {
            System.out.print(number + " ");
        }

        // Removing an element by value
        System.out.println("\nEnter an integer to remove from the ArrayList:");
        int numToRemove = scanner.nextInt();
        numberList.remove(Integer.valueOf(numToRemove));

        // Printing the updated ArrayList
        System.out.println("Updated ArrayList after removing " + numToRemove + ":");
        for (int number : numberList) {
            System.out.print(number + " ");
        }

        // Getting the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + numberList.size());

        scanner.close();
    }
}

