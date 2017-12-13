class LinkedList{
	Node head;

	class Node{
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push (int new_data)	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void append(int new_data) {
		Node new_node = new Node(new_data); //Allocate the Node;
		
		//If the linked list is empty, then make the new node as head 
		if(head == null) {
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;

	}

	public void insertAfterGivenNode(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("Given node can't be null ... :(");
			return ;
		}

		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void print() {
		Node prinnode = head;
		while(prinnode != null) {
			System.out.print(prinnode.data+ " ");
			prinnode = prinnode.next;
		}
	}

	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList();
		llist.append(6);
		llist.push(7);
		llist.push(1);

		llist.insertAfterGivenNode(llist.head.next, 18);
		System.out.print("Created Linked List: ");
		llist.print();
		System.out.print("\n");
	}
}