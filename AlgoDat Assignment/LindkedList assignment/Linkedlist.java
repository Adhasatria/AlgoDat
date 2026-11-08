abstract public class Linkedlist {
    private  Node head = null;
    private Node tail = null;

    public void insertValue(String data){
        Node newnode = new Node(data);

        if(head ==  null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next= newnode;
            tail = newnode;
        }
    }

    protected String getLastValue(){
        if(isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return tail.value;
    }

    protected String removeLastValue(){
        if(isEmpty()){
            throw new IllegalStateException("List is empty");
        }

        String value = tail.value;
        if(head == tail){
            head = null;
            tail = null;
            return value;
        }

        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail = current;
        return value;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current=current.next;
            if (current == null){
                System.out.print("null");

            }
        }
    }

    public String getJenis(){
        return "Thing";
    }





    


   public static void main(String[] args) {
       
   }
}
