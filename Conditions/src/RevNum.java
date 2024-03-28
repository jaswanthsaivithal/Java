import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;

        while (n > 0)
        {
            int r = n%10;
            n = n/10;
            ans = ans*10 + r;
        }
        System.out.println(ans);
    }
}
