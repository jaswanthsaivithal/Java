public class CountNums {
    public static void main(String[] args) {
        int n = 433453436;
        int count = 0;
        while (n > 0)
        {
           int r = n%10;
           if (r == 3){
               count++;
               n = n/10;
           }
           else {
               n = n / 10;
           }
        }
        System.out.println(count);
    }
}
