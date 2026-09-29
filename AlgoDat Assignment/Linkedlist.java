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
