import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
        /*switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;    // if there is no break it keep on going until next break statement and stops there if there is no break statement it will go until the end.
            case "Grapes":
                System.out.println("Smalle fruit");
                break;
            default:    //default is used if the above cases are not valid then default will get executed.
                System.out.println("Please Enter a valid fruit");
        }*/
        int day = in.nextInt();
        switch (day) {
            case 1 :     // we can use "{}" instead of ":"
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Enter valid Number!!");
        }
        // we can write the same above case in simpler way like:
        // case 1 -> System.out.println("Monday");
        /*switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }*/
    }
}
