package javabasics2;

public class maruthi implements vehicle {
public static void main(String[] args) {
	maruthi mr= new maruthi();
	
	mr.wheels();
	mr.speed();
}
	@Override
	public void wheels() {
		System.out.println("4");
		
	}

	@Override
	public void speed() {
		System.out.println("100km/hr");
		
	}

}
