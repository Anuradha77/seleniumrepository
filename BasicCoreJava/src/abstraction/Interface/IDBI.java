package abstraction.Interface;

public class IDBI implements RBI {

public void savingAccount() {
		
		System.out.println("saving account in IDBI bank");
		
	}

	@Override
	public void currentAccount() {
		
		System.out.println("current Account in IDBI bank");
		
	}

	@Override
	public void debitCard() {
		
		System.out.println("debit card of IDBI bank");
		
	}

	@Override
	public void creditCard() {
		
		System.out.println("Credit card of IDBI bank");
	}

}
