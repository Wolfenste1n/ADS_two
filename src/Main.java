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
                    testArrayList();
                    break;
                case 2:
                    testLinkedList();
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

    public static void testArrayList() {
        System.out.println("Testing ArrayList");
        MyArrayList<Student> list = new MyArrayList<>();
        list.add(new Student("Madiyar", 18));
        list.add(new Student("Batyr", 18));
        list.add(new Student("Dima", 19));
        list.add(new Student("Dayana", 17));
        list.add(new Student("Katya", 17));
        print(list);
        System.out.println("Element with index 0: " + list.get(0));
        System.out.println("Size of arraylist: " + list.size());
        list.remove(0);
        System.out.println("ArrayList without first element: ");
        print(list);
        list.clear();
        System.out.println("Clear arraylist: ");
        print(list);
    }

    public static void testLinkedList() {
        System.out.println("Testing LinkedList");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        print(list);
        System.out.println("Size of linked list: " + list.size());
        list.clear();
        System.out.println("Clear linked list: ");
        print(list);
    }

    public static <T> void print(MyList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
