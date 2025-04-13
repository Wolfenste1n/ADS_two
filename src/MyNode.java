public class MyNode<E> {
    E data;
    MyNode<E> next;
    MyNode<E> prev;

    public MyNode(E data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public E getData() {
        return data;
    }
    public MyNode<E> getNext() {
        return next;
    }
    public MyNode<E> getPrev() {
        return prev;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }
    public void setPrev(MyNode<E> prev) {
        this.prev = prev;
    }

}
