package in.ashokit;

public class PaymentService {
	private IPayment payment;

	public PaymentService(IPayment payment) {
		this.payment = payment;
	}

	public void Payment(double bill) {
		boolean status = payment.processpayment(bill);
		if (status = true) {
			System.out.println("Print Recipt----");
		} else {
			System.out.println("Payment  Trouble----");
		}
	}
}
