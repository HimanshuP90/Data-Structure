class LinkedList {
	Node head;
	class Node{
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteNode(int key) {
		Node tmp = head, prev = null;

		if ( tmp != null && tmp.data == key) {
			head = tmp.next;
			return;
		}

		while( tmp != null && tmp.data != key) {
			prev = tmp;
			tmp = tmp.next; 
		}

		if(tmp == null) return;

		prev.next = tmp.next;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.data+ " ");
			tmp = tmp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();
 
        llist.deleteNode(1); // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
     }
}