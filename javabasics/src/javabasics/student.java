package javabasics;

public class student {
int rollno;
 String name;
 int phono;
 String add;
 
	 /*void display()
 {
	 System.out.println(rollno);
	 System.out.println("name");*/
/*public static void main(String args[]) {
	 student st=new student();
	 st.rollno=2;
	 st.name="John";
	System.out.println("rool number is:" +st.rollno);
	System.out.println("name of the student:"+st.name);*/
	
public static void main(String args[]) {
	student st1=new student();
	st1.name="john";
	st1.rollno=1;
	st1.phono=234567890;
	st1.add="wildwood ridge:";
	student st2=new student();
	st2.name="sam";
	st2.rollno=2;
	st2.phono=789345678;
	
	st2.add="parkwat st";
	
	System.out.println("name of the students;"+st1.name);
	System.out.println("rollno of the students;"+st1.rollno);
	System.out.println("ph no of the students;"+st1.phono); 
	System.out.println("add of the students;"+st1.add);
	System.out.println("name of the students;"+st2.name);
	System.out.println("rollno of the students;"+st2.rollno);
	System.out.println("ph no of the students;"+st2.phono); 
	System.out.println("add of the students;"+st2.add);
	 
	 
	 
	
	
	 
	 
 }
 

	}


