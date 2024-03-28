import java.math.BigInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        long Num = 1534236469;
        if (Num > 0)
        {
            System.out.println(Rev(Num));
        } else if (Num < 0) {
            long Num1 = -1*(Num);
            long Rev1 = Rev(Num1);
            System.out.println(-1*Rev1);
        }
        else {
            System.out.println("0");
        }
    }

    static long Rev(long Num)
    {
        long Ree = 0;
        long Rem;
        while(Num > 0)
        {
            Rem = Num%10; //123 - 3
            Ree = Ree*10 + Rem; // 3
            Num = Num/10;//123/10 - 12

        }
        return Ree;
    }
}
