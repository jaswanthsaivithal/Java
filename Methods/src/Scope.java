import java.sql.SQLOutput;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 78;
            int c = 99;
        }
        System.out.println(a);
        int c = 100;
        System.out.println(c);
       // System.out.println(c); we cant use inside intialized variable outside
    }
}
