package javabasics2;

public class tvs  extends bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tvs obj1=new tvs(); 
	obj1.speed();
	obj1.wheels();

	}

	@Override
	void speed() {
		System.out.println("240km/hr");
		
	}

}
