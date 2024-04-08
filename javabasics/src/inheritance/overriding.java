package inheritance;

class bank{
     int getrateofintrest()
       {
    	 return 0;
     }
}
class SBI extends bank
{
	int getrateofintrest()
    {
 	 return 10;
  }
	
}
class ICICI extends bank
{
	int getrateofintrest()  // overriding definition is same body can be different//
    {
 	 return 15;
  }
}
class AXIS extends bank{
	int getrateofintrest()
    {
 	 return 20;
  }
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SBI d=new SBI();
  System.out.println(d.getrateofintrest());
  ICICI f=new ICICI();
  System.out.println(f.getrateofintrest());
  AXIS g=new AXIS();
 System.out.println (g.getrateofintrest());
 
		   
	}

}
