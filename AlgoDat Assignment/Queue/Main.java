package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Kosong awal: " + queue.isEmpty());

        queue.enqueue("10");
        queue.enqueue("20");
        queue.enqueue("30");

        System.out.println("Elemen depan: " + queue.peek());
        System.out.println("Dikeluarkan: " + queue.dequeue());
        System.out.print("Sisa queue: ");
        queue.display();
        System.out.println();
    }
}
