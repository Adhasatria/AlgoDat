

public class Main {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();

        Node node1 = new Node(10);
        Node node2 = new Node(8);
        Node node3 = new Node(6);

        linkedlist.insertNode(node1);
        linkedlist.insertNode(node2);
        linkedlist.insertNode(node3);

        linkedlist.display(node1);

        linkedlist.deletion(node1, node3);
    }
}
