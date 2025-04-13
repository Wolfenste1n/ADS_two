import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.get(2));
        print(list);
        MyLinkedList<Integer> list1 = new MyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        print(list1);

        MyArrayList<Student> list2 = new MyArrayList();
        list2.add(new Student("Madiyar", 18));
        list2.add(new Student("Batyr", 18));
        list2.add(new Student("Dima", 19));
        list2.add(new Student("Dayana", 17));

        print(list2);

    }
    public static <T> void print(MyList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
//teacher's code//