import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Jaswanth");
                break;
            case 2:
                System.out.println("Kumar");
                break;
            case 3:
                System.out.println("Pavan");
                break;
            case 4:
                System.out.println("Emp Number 4");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid deparment entered");
                }
                break;
            default:
                System.out.println("Invalid empID entered");
        }
    }
}

