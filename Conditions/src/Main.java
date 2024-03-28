import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print("What is the salary : ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 10000)
        {
            salary = salary + 2000;
        }
        else {
            salary = salary + 1800;
        }
        System.out.println("New salary is : " + salary);
    }
}