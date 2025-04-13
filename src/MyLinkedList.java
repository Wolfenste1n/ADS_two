import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        length++;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeLast() {
        if(head == tail) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.next = null;
        }
        length--;
    }

    @Override
    public void removeFirst(){
        if(head == tail) {
            head = tail = null;
        } else {
            head = head.getNext();
        }
        length--;
    }

    @Override
    public void clear() {
        MyNode<T> current = head;
        while (current != null) {
            MyNode<T> next = current.next;
            current.prev = null;
            current.next = null;
            current.data = null;
            current = next;
        }
        head = tail = null;
        length = 0;
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
//teacher's code//