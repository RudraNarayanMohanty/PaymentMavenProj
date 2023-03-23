package in.ashokit;

public class App {
	public static void main(String[] args) {
		System.out.println("Santosh Modified");//It's correct
		PaymentService ps = new PaymentService(new SodexCardPayment());
		ps.Payment(400.0);
	}
}
