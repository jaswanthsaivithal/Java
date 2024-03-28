import java.util.Arrays;

public class Overloading {
    /*
    public static void main(String[] args) {
        fun(66);
        fun("sar");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }*/
    /*public static void main(String[] args) {
        int ans = fun(3, 4, 5);
        System.out.println(ans);
    }
    static int fun(int a, int b)
    {
        return a+b;
    }
    static int fun(int a, int b, int c){
        return a+b+c;
    }*/
    public static void main(String[] args) {
        demo(1, 2 ,3 ,4);
        demo("sai", "slf", "fsf");
        // demo() it shows error due to it doesnt take any value
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
