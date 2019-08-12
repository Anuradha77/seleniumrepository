package abstraction.Interface;

public class User {

	public static void main(String[] args) 
	{
		
		RBI bank=null;
		String bankname;
		
		/*
		 * bankname="SBI"; 
		 * bankname="IDBI";
		 */
		bankname="CITI";
		
		if (bankname.equals("SBI"))
		{
			bank=new SBI();
		}else if(bankname.equals("IDBI"))
		{
			bank =new IDBI();
		}else if(bankname.equals("CITI"))
		{
			bank= new CITI();
		}
		
		
		bank.creditCard();
		bank.debitCard();
		bank.currentAccount();
		bank.savingAccount();
		
		
		

	}

}
