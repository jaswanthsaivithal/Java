public class Shadowing {
    static int x = 90; // this will be shadowed at lin 6
    public static void main(String[] args) {
        System.out.println(x); // 90
        //int x = 40; // the class variable at line 2 is shadowed by this
        //System.out.println(x); //40
        int x;// here it is declared
       // System.out.println(x); this wont work bcoz the scope will begin when variable is initialized. after declarization if u print it it will pop an error
        x = 40; // here it is intialized
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x); //90
    }
}
