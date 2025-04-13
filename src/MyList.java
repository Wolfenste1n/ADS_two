public interface MyList<T> extends Iterable<T> {
    void add(T item);
    int size();
    void remove(int index);

    void removeLast();

    void removeFirst();

    void clear();
    T get(int index);
}
//teacher's code//