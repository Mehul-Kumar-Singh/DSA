
public class Student_this_keyword {
   int roll_no;
   String name;
   float marks;
   
   // this refers to current object
   // mainly this internally replaced by current object name, here this=s1
   Student_this_keyword(int roll_no, String name){
	   this.roll_no = roll_no;
	   this.name = name;
   }
   Student_this_keyword(int roll_no, String name, float marks){
	   this.roll_no = roll_no;
	   this.name = name;
	   this.marks = marks;
   }
   
   // this is also used to call another constructor from one constructor
   // this() should always be the first line.
   Student_this_keyword(){
	   this(2, "Rahul");
//	   this(2, "Arnab" , 95);
   }
	public static void main(String[] args) {
		Student_this_keyword s1 = new Student_this_keyword(1, "Mehul");
		System.out.println("s1 object: " +s1.roll_no+ " " +s1.name);
		Student_this_keyword s2 = new Student_this_keyword();
		System.out.println("s2 object: " +s2.roll_no+ " " +s2.name);


		
	} 

}
