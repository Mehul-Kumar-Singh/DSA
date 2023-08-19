package LL;

public class Linked_List {
   private Node head;
   private Node tail;
   
   private int size;
   
   public Linked_List(){
	   size = 0;
   }
   public void insertFirst(int value) {
	 Node new_Node = new Node(value);
		 new_Node.next = head;
		 head = new_Node;
		 
		 if(tail==null) { // it is the first item added to the Linked list
		 tail = head;
		 }
		 
		 size += 1;
	}
   
   public void insertLast(int value) {
	   Node new_Node = new Node(value);
	   Node temp = head;
	   if(head == null) {
		   insertFirst(value);
	   }
	   while(temp.next!=null) {
		   temp = temp.next;
	   }
	   temp.next = new_Node;
	   new_Node.next = null;
	   size += 1;
   }
   
   public void insertAtAnyPosition(int value, int index) {
	   if(index == 0) {
		   insertFirst(value);
		   return;
	   }
	   if(index == size) {
		   insertLast(value);
		   return;
	   }
	   Node temp = head;
	   for(int i=1;i<index;i++) {
		   temp = temp.next;
	   }
	   Node new_Node = new Node(value, temp.next);
	   temp.next = new_Node;
	   size++;
   }
   
   public int deleteFirst() {
	   if(size == 1) {
		   int del_val = head.value;
		   head = null;
		   size--;
		   return del_val;
	   }
	   Node temp = head;
	   int del_val = temp.value;
	   temp = temp.next;
	   head = temp;
	   size--;
	   return del_val;
   }
   
   public int deleteLast() {
	  Node temp = head;
	  for(int i=1;i<size-1;i++) {
		  temp = temp.next;
	  }
	  int del_val = temp.next.value;
	  temp.next = null;
	  size--;
	  return del_val;
   }
   
   public int delete(int index) {
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
	   Node temp = head;
   while(temp!=null) {
	   System.out.print(temp.value+ "->");
       temp = temp.next;
      }
   System.out.println("END");
   }
   
	private class Node{
		private int value;
		private Node next;
		
		Node(int value){
			this.value = value;
		}
		Node(int value,Node next){
			this.value = value;
			this.next = next;
		}
	}

}
