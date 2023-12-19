
public class Payments {

}
interface PaymentInt{
	public  void payment(double amount);
}
class CashPayment implements PaymentInt{

	public CashPayment(){}
	
	@Override
	public void payment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Cash payment of amount " + amount);
	}
}
class PayPalPayment implements PaymentInt{

	double charge;
	public PayPalPayment(){}
	
	@Override
	public void payment(double amount) {
		this.charge = amount * .03d;
		// TODO Auto-generated method stub
		System.out.println("Paypal cash payment of amount " + (amount + this.charge));
	}
}
