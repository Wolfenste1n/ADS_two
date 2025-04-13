public class MyNode<E> {
    public E data;
    public MyNode<E> next;
    public MyNode<E> prev;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
