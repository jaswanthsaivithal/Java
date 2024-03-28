import java.util.Scanner;

public class StringGreeting {
    public static void main(String[] args) {
        /*String greeting = greet();
        System.out.println(greeting);*/
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String spell = in.next();
        String personalized = myGreet(spell);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String message = "How are You";
        return message;

    }
}
