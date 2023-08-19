package DLL;

public class Double_Linked_List {
    private Node head;
    private Node tail;
    
    private int size;
    
    public Double_Linked_List(){
    	this.size = 0;
    }
    
    public void insertFirst(int value) {
    	Node new_Node = new Node(value);
    	if(head==null) {
    		head = new_Node;
    		tail = new_Node;
    		head.next = null;
    		tail.next = null;
    		head.prev = null;
    		tail.prev = null; 
    		size++;
    		return;
    	}
    	new_Node.next = head;
    	head.prev = new_Node;
    	head = new_Node;
    	head.prev = null;
    	size++;
    }
    
    public void insertLast(int value) {
    	if(head==null) {
    		insertFirst(value);
    		return;
    	}
    	Node new_node = new Node(value);
    	Node temp = head;
    	for(int i=1;i<size;i++) {
    		temp = temp.next;
    	}
    	temp.next = new_node;
    	new_node.prev = temp;
    	new_node.next = null;
    	tail = new_node;
    	size++;
    }
    
    public void insertAtAnyPosition(int value,int index) {
    	if(index==1) {
    		insertFirst(value);
    		return;
    	}
    	if(index == size) {
    		insertLast(value);
    		return;
    	}
    	Node new_node = new Node(value);
    	Node temp = head;
    	for(int i=1;i<index;i++) {
    		temp = temp.next;
    	}
    	new_node.next = temp.next;
    	temp.next.prev = new_node;
    	temp.next = new_node;
    	new_node.prev = temp;
    	size++;
    }
    
    public void display() {
    	Node temp = head;
    	while(temp != null) {
    		System.out.print(temp.value+ "->");
    		temp = temp.next;
    	}
    	System.out.println("END");
    }
	
    public void reverse_display() {
    	Node temp = head;
    	Node last = null;
    	while(temp != null) {
    		last = temp;
    		temp = temp.next;
    	}
    	// here,last is pointing to last node
    	while(last !=null) {
    		System.out.print(last.value+ "->");
    		last = last.prev;
    	}
    	System.out.print("START");
    }
	private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}
	public static void main(String[] args) {
 
	}

}
