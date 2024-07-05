public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add node at first position 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    //add node at last position 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
       Node currNode = head;
       while (currNode.next!= null) 
       {
        currNode=currNode.next;
       }
       currNode.next=newNode;
    }
    //printing node
    public void printNode(){
         if(head == null){
            System.out.println("List is empty");
            return;
        }
       Node currNode = head;
       while (currNode != null) {
        System.out.print(currNode.data +"->");
        currNode=currNode.next; 
       }
       System.out.println("Null");
    }
     public static void main (String args []){
        LL list =new LL();
        list.addFirst("Hii");
        list.addLast("Sushh..");
        list.printNode();
     }
}
