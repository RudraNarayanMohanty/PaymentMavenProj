package in.ashokit;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processpayment(double bill) {
		// logic
		System.out.println("DebitCardPayment Processed------");
		return false;
	}

}
