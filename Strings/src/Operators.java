import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        //this is same as after few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(6));
        //System.out.println(new Integer(55) + new ArrayList<>());
        // the above expression gives error because in java we can use + operator for primitives and complex objects
        // where as while using them we need atleast one string that need to be concatenated whether itis null string or valued string it doesnt matters.
        // we cant use - operator for strings but we can use it for primitive data types

        System.out.println(new Integer(55) + "" + new ArrayList<>());
    }
}
/*
Java doesn't allow user defined operator overloading
because if you allow programmer to do operator overloading
they will come up with multiple meanings for same operator
which will make the learning curve of any developer hard
and things more confusing and messing.

to concatenate two complex objects we need to use string in java to make it works
 */