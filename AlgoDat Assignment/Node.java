class Node{
    Integer data;
    Node next = null;

    

    Node(int value){
        data = value;
    }

    void checkData(){
        System.out.println(data);
    }

    void nextNode(Node nextNode){
        next = nextNode;
    }
    
    public static void main(String[] args) {
        
    }
}