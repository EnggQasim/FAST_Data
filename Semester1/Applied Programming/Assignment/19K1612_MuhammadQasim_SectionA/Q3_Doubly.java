// Java program to illustrate inserting 
// a Node in a Cicular Doubly Linked list 
// in begging, end and middle 
class SHS 
{ 
	
// Structure of a Node 
static class Node 
{ 
	int data; 
	Node next; 
	Node prev; 
}; 

// Function to insert a node at the end 
static Node insertNode(Node start, int value) 
{ 
	// If the list is empty, create a single node 
	// circular and doubly list 
	if (start == null) 
	{ 
		Node new_node = new Node(); 
		new_node.data = value; 
		new_node.next = new_node.prev = new_node; 
		start = new_node; 
		return new_node; 
	} 

	// If list is not empty 

	// Find last node / 
	Node last = (start).prev; 

	// Create Node dynamically 
	Node new_node = new Node(); 
	new_node.data = value; 

	// Start is going to be next of new_node 
	new_node.next = start; 

	// Make new node previous of start 
	(start).prev = new_node; 

	// Make last preivous of new node 
	new_node.prev = last; 

	// Make new node next of old last 
	last.next = new_node; 
	
	return start; 
} 

// Function to display the 
// circular doubly linked list 
static void displayList(Node start) 
{ 
	Node temp = start; 

	while (temp.next != start) 
	{ 
		System.out.printf("%d ", temp.data); 
		temp = temp.next; 
	} 
	System.out.printf("%d ", temp.data); 
} 

// Function to search the particular element 
// from the list 
static int searchList(Node start, int search) 
{ 
	// Declare the temp variable 
	Node temp = start; 
	
	// Declare other control 
	// variable for the searching 
	int count = 0, flag = 0, value; 
	
	// If start is null return -1 
	if(temp == null) 
		return -1; 
	else
	{ 
		// Move the temp pointer until, 
		// temp.next doesn't move 
		// start address (Circular Fashion) 
		while(temp.next != start) 
		{ 
			// Increment count for location 
			count++; 
			
			// If it is found raise the 
			// flag and break the loop 
			if(temp.data == search) 
			{ 
				flag = 1; 
				count--; 
				break; 
			} 
			
			// Increment temp pointer 
			temp = temp.next; 
		} 
		
		// Check whether last element in the 
		// list content the value if contain, 
		// raise a flag and increment count 
		if(temp.data == search) 
		{ 
			count++; 
			flag = 1; 
		} 
		
		// If flag is true, then element 
		// found, else not 
		if(flag == 1) 
			System.out.println("\n"+search +" found at location "+ 
											count); 
		else
			System.out.println("\n"+search +" not found"); 
	} 
	return -1; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	// Start with the empty list / 
	Node start = null; 

	// Insert 4. So linked list becomes 4.null 
	start= insertNode(start, 4); 

	// Insert 5. So linked list becomes 4.5 
	start= insertNode(start, 5); 

	// Insert 7. So linked list 
	// becomes 4.5.7 
	start= insertNode(start, 7); 

	// Insert 8. So linked list 
	// becomes 4.5.7.8 
	start= insertNode(start, 8); 

	// Insert 6. So linked list 
	// becomes 4.5.7.8.6 
	start= insertNode(start, 6); 

	System.out.printf("Created circular doubly linked list is: "); 
	displayList(start); 
	
	searchList(start, 5); 
} 
} 
