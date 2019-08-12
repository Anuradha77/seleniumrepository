package abstraction.Interface;

public class SBI implements RBI {

public void savingAccount() {
		
		System.out.println("saving account in SBI bank");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("current Account in SBI bank");
		
	}

	@Override
	public void debitCard() {
		
		System.out.println("debit card of SBI bank");
		
	}

	@Override
	public void creditCard() {
		
		System.out.println("Credit card of SBI bank");
	}

}
