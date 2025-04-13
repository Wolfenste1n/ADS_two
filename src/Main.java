import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Choose list type for testing methods");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. Exit program");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ArrayList");
                    MyArrayList<Student> list2 = new MyArrayList<>();
                    list2.add(new Student("Madiyar", 18));
                    list2.add(new Student("Batyr", 18));
                    list2.add(new Student("Dima", 19));
                    list2.add(new Student("Dayana", 17));
                    list2.add(new Student("Katya", 17));
                    print(list2);
                    System.out.println("Element with index 0: " + list2.get(0));
                    System.out.println("Size of arraylist: " + list2.size());
                    list2.remove(0);
                    System.out.println("ArrayList without first element: ");
                    print(list2);
                    list2.clear();
                    System.out.println("Clear arraylist: ");
                    print(list2);
                    break;
                case 2:
                    System.out.println("LinkedList");
                    MyLinkedList<Integer> list1 = new MyLinkedList<>();
                    list1.add(1);
                    list1.add(2);
                    list1.add(3);
                    print(list1);
                    System.out.println("size of linked list " + list1.size());
                    list1.clear();
                    System.out.println("clear linked list: ");
                    print(list1);
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        scanner.close();
    }

    public static <T> void print(MyList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
