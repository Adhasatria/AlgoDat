public class Linkedlist {
    Node head = null;
    Node tail = null;

    void insertNode(Node newnode){
        if(head ==  null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next= newnode;
            tail = newnode;
        }
    }

    void display(Node current){
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    void deletion(Node current, Node previous){
        previous.next=current.next;
    }


   public static void main(String[] args) {
       
   }
}
