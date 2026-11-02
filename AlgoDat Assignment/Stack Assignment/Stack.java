public class Stack {
    private String[] elements = new String[10];
    private int size;

    public void push(String value) {
        if (size == elements.length) {
            String[] expanded = new String[elements.length * 2];
            System.arraycopy(elements, 0, expanded, 0, elements.length);
            elements = expanded;
        }
        elements[size++] = value;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String value = elements[--size];
        elements[size] = null;
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
