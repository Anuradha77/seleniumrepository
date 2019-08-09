package Functions;

public class User2 {

	public static void main(String[] args) 
	
	{
		Car wagnor=new Car("Black","version1");
		wagnor.specification();

		Car maruti=new Car();
		
		maruti.colour="white";
		maruti.model="VDI";
		/* maruti.wheels=4; */
		maruti.specification();	
	}

}
