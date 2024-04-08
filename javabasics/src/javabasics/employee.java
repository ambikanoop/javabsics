package javabasics;

public class employee {
	int empid;
	String empname;
	int empsalary;
	
	void setdata(int id,String name,int sal)
	{
		empid=id;
		empname=name;
		empsalary=sal;
	}
	
	/*employee(int id,String name,int sal)//contractor//
	{
		empid=id;
		empname=name;
		empsalary=sal;
		
		
	}*/
	
	void display()//methos//
	
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		
	}
		
	
	public static void main(String args[]) {
		/*employee imp1=new employee();
		imp1.empid=90;
		imp1.empname="anoop";
		imp1.empsalary=100;
		imp1.display();*/
		
		/*employee imp1=new employee(100,"a",200);
		imp1.display();
		*/
		
		employee imp1=new employee();
		imp1.setdata(100,"b",700);
		imp1.display();
		
		
	}

}
