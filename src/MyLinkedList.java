import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements MyList<T> {
    private static class Node<T> {
        T data;
        Node<T> next, prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head, tail;
    private int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T item) {

    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == size) {
            add(item);
            return;
        }
        Node<T> newNode = new Node<>(item);
        Node<T> current = getNodeAt(index);
        Node<T> prev = current.prev;
        newNode.next = current;
        newNode.prev = prev;
        current.prev = newNode;
        if (prev != null) prev.next = newNode;
        else head = newNode;
        size++;
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T get(int index) {
        return getNodeAt(index).data;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {
        Node<T> node = getNodeAt(index);
        unlink(node);
    }

    @Override
    public void removeFirst() {
        if (head == null) throw new NoSuchElementException();
        unlink(head);
    }

    @Override
    public void removeLast() {
        if (tail == null) throw new NoSuchElementException();
        unlink(tail);
    }

    @Override
    public void clear() {
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;
            current.data = null;
            current.next = current.prev = null;
            current = next;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean exists(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private Node<T> getNodeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<T> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    private void unlink(Node<T> node) {
        Node<T> prev = node.prev, next = node.next;
        if (prev != null) prev.next = next;
        else head = next;
        if (next != null) next.prev = prev;
        else tail = prev;
        node.data = null;
        node.next = node.prev = null;
        size--;
    }
}
