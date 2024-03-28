import java.util.ArrayList;
import java.util.Scanner;

public class
ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        /*list.add(66);
        list.add(623);
        list.add(2324);
        list.add(653);
        list.add(434);
        list.add(878);
        System.out.println(list);
        System.out.println(list.contains(2324)); // whether the given number is consisted in the list
        list.set(0, 99); // here zeroth index is set as 99
        System.out.println(list);
        list.remove(3); // remove the index number 3 which is 653
        System.out.println(list);*/
        for (int i = 0; i < 5; i++)
        {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(list.get(i) + " "); // pass index here, list[index] syntax will not work here.
        }
        System.out.println("");
        System.out.println(list);
    }
}
//1) size is fixed internally in arraylist
//2) say arraylist fills by some amount
//   if the size  required is more than allocated then
//   it will add a new arraylist of say, double the size of the old elements
//   old elements are copied in the new one and it will add the new object needed to be added
//   the it will delete the old array
//   [1,2,3] ---> if u want to add four to this array where size is 3
//   [1,2,3] --> [1,2,3,_ _ _] ---> it will double the size
//   [1,2,3] --> [1,2,3,4 _ _] ---. it will add the new element
//   [1,2,3,4 _ _] ---> it will delete the old array