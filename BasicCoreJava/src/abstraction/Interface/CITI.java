package abstraction.Interface;

public class CITI implements RBI{

	@Override
	public void savingAccount() {
		
		System.out.println("saving account in CITI bank");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("current Account in CITI bank");
		
	}

	@Override
	public void debitCard() {
		
		System.out.println("debit card of CITI bank");
		
	}

	@Override
	public void creditCard() {
		
		System.out.println("Credit card of CITI bank");
	}

}
