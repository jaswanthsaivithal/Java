public class Comparision {
    public static void main(String[] args) {
        String a = "jaswanth";
        String b = "jaswanth";
        System.out.println(a == b);

        String x = new String("jaswanth");
        String y = new String("jaswanth");
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}

//If two strings are having same value then both of them are pointed to one value(jaswanth) in heap (string pool).
//you only get equal if both the strings pointed to one value in heap.
// strings are immuttable. where if one thing got changed it dont disturb others.

