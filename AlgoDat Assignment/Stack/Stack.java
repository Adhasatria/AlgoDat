

package Stack;

import LindkedList.Linkedlist;

public class Stack extends Linkedlist {
    public void push(String value) {
        insertValue(value);
    }

    public String pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return removeLastValue();
    }

    public String peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return getLastValue();
    }
}
