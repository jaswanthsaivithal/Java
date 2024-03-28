import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Jaswanth JSV";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("   sksd       ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
/*
when using split regex:
ex: "jas: sas: bas"
if we use split(" ") - it will remove white spaces and split the string into parts and keep them in array
out: {"jas:", "sas:", "bas"}
if we use split(":")
out: {"jas", " sas", " bas"}
 */