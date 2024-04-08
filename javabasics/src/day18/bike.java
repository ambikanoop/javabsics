package day18;
 class bike {
	
		void speed() {
			System.out.println("speed");
		}
	}
	class honda extends bike{
		void color() {
			System.out.println("white");
		}

	public static void main(String[]args) {
		honda obj=new honda();
		obj.color();
		obj.speed();
	}
	}

