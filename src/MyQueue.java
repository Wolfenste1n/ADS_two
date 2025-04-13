public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = list.get(0);
        list.remove(0);
        return item;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
