package javabasics2;

public class honda extends bike {
public static void main(String[] args) {
	honda obj= new honda();
obj.wheels();
obj.speed();
	
}

@Override
void speed() {
	System.out.println("120km/hr");
	
}
}
