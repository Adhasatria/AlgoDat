

package Queue;

import LindkedList.Linkedlist;

public class Queue extends Linkedlist {
    public void enqueue(String value) {
        insertValue(value);
    }

    public String dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return removeFirstValue();
    }

    public String peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return getFirstValue();
    }
}
