package CLL;

public class Circular_Linked_list {
     private Node head;
     private Node tail;
     
     private int size;
     
     public Circular_Linked_list() {
    	 this.size=0;
     }
     
     public void insertFirst(int value) {
    	 Node new_node = new Node(value);
    	 if(head == null) {
    		 head = new_node;
    		 head.next = head;
    		 tail = new_node;
    		 tail.next = tail;
    		 size++;
    		 return;
    	 }
    	 Node temp = head;
    	 while(temp.next!=head) {
    		 temp = temp.next;
    	 }
    	 temp.next = new_node;
    	 new_node.next = head;
     }
     
     public int deleteFirst() {
    	 Node temp = head;
    	 int del_val = head.value;
    	 while(temp.next!=head) {
    		 temp = temp.next;
    	 }
    	 temp.next = head.next;
    	 head = temp.next;
    	 size--;
    	 return del_val;
     }
     
     public int deleteLast() {
    	 Node temp = head;
    	 while(temp.next.next!=head) {
    		 temp = temp.next;
    	 }
    	 int del_val = temp.next.value;
    	 temp.next = head;
    	 size--;
    	 return del_val;
     }
     
     public int deleteAtAnyPosition(int index) {
    	 if(index == 1) {
    		 int del_val = deleteFirst();
    		 return del_val;
    	 }
    	 if(index == size) {
    		 int del_val = deleteLast();
    		 return del_val;
    	 }
    	 Node temp = head;
    	 for(int i=1;i<index-1;i++) {
    		 temp = temp.next;
    	 }
    	 int del_val = temp.next.value;
    	 temp.next = temp.next.next;
    	 size--;
    	 return del_val;
     }
     public void display() {
    	 if(head==null) {
    		 System.out.println("List is empty.");
    		 return;
    	 }
    	 Node temp = head;
    	 do{
    		 System.out.print(temp.value+ "->");
    		 temp = temp.next;
    	 }while(temp!=head);
    	 System.out.println("HEAD->");
     }

	 private class Node{
		 private int value;
		 private Node next;
		 
		 Node(int value){
			 this.value = value;
		 }
		 Node(int value, Node next){
			 this.value = value;
			 this.next = next;
		 }
	 }
	
}
