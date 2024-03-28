public class Performance {
    public static void main(String[] args) {
        String Series = "";
        for (int i=0; i<26; i++)
        {
            char ch = (char)('a'+i);
            Series = Series + ch;
        }
        System.out.println(Series);
    }
}
//while running this program every time the loop runs it will create a new value in string pool
// 1 -> ""+'a'
// 2-> "a" + 'b'
//3-> "ab" + 'c'
//goes on......
// so the timecomplextixity and space complexity increases.
