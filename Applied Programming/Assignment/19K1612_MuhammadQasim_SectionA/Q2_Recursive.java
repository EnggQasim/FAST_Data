// Recursive Java program to count number of nodes in  
// a linked list 
  
/* Linked list Node*/
class Node 
{ 
    int data; 
    Node next; 
    Node(int d)  { data = d;  next = null; } 
} 
  
// Linked List class 
class LinkedList 
{ 
    Node head;  // head of list 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
  
        new_node.next = head; 
  
        head = new_node; 
    } 
  
    public int getCountRec(Node node) 
    { 
        // Base case 
        if (node == null) 
            return 0; 
  
        // Count is this node plus rest of the list 
        return 1 + getCountRec(node.next); 
    } 
  
    /* Wrapper over getCountRec() */
    public int getCount() 
    { 
        return getCountRec(head); 
    } 
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
        llist.push(1); 
        llist.push(3); 
        llist.push(1); 
        llist.push(2); 
        llist.push(1); 
  
        System.out.println("Count of nodes is " + 
                           llist.getCount()); 
    } 
} 
