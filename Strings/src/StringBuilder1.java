public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< 26; i++)
        {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
// refer this page for more info about stringbuffer, string builder and string
//https://www.digitalocean.com/community/tutorials/string-vs-stringbuffer-vs-stringbuilder