package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processpayment(double bill) {
		// logic
				System.out.println("CreditCardPayment Processed------");

		return false;
	}

}
