public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void add(T value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public T peek() {
        if (heap.size() == 0) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    public T poll() {
        if (heap.size() == 0) throw new IllegalStateException("Heap is empty");
        T result = heap.get(0);
        T last = heap.get(heap.size() - 1);
        heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.add(0, last);
            heapifyDown(0);
        }
        return result;
    }

    public int size() {
        return heap.size();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap.get(left).compareTo(heap.get(smallest)) < 0)
                smallest = left;
            if (right < size && heap.get(right).compareTo(heap.get(smallest)) < 0)
                smallest = right;

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.add(i, heap.get(j));
        heap.add(j, temp);
    }
}
