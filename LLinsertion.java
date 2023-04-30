public class Node{
    int data;         //two instance variable data and next
    Node next;
    public Node(int data){    //constructor name same as class name
        this.data = data;
        this.next = null;
    }

}

//Now we can create a Linked List class that will "use the Node" class to 
//create and manipulate a linked list

public class LinkedList1{
    Node head;
     
    public LinkedList1(){
        this.head = null;
    }

    
    public void insertNode(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node temp = this.head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


     
    public void printList(){
        Node temp = this.head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
}


public class Main{
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(9);
        list.printList();
        
    }
    }

