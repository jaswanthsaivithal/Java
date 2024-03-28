public class Palindromewithstringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("abccba");
        String rev = str.reverse().toString();
        System.out.println(rev);// reverse is to reverse the stringbuilder and tostring is to change stringbuilder to string
        if(str.toString().equals(rev))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
