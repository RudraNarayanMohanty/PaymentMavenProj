package in.ashokit;

public class SodexCardPayment implements IPayment {

	@Override
	public boolean processpayment(double bill) {
		// logic
		System.out.println("SodexCardPayment Processed------");
		return false;
	}

}
