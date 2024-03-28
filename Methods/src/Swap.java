public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
     //   System.out.println(a + " " + b);

/*swap numbers code
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);*/

    }
    /*static void swap(int a, int b) { // if u change the value it doesnt effect the original bcoz it is primitive(integer) in java primitives uses pass by value only
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid in this function scope only.
    }*/
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " "+ b); // this will work bcoz we are printing the change value inside the function.
    }

}
