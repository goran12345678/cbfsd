
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*
		Person person = new Person();
	    person.setDescription("brown");
	    
	    MartianPerson mPerson = new MartianPerson();
	    mPerson.setDescription("brown", 72, "brown");
	    mPerson.describe();
	    
	    //Casting
	    IDescription idescr = (IDescription) mPerson;
	    idescr.describe();
	    */
		CashPayment payment = new CashPayment();
		payment.payment(100.50d);
		
		PayPalPayment ppp = new PayPalPayment();
		ppp.payment(100.50d);
	}
	
}

class Person implements IDescription,  IHeight{
	String eyeColor;
	int height;
	String hairColor = "yellow";
	public void setDescription(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	//overloaded
	public void setDescription(String eyeColor, int height) {
		this.eyeColor = eyeColor;
		this.height = height;
	}
	//overloaded
	public void setDescription(String eyeColor, int height, String hairColor) {
		this.eyeColor = eyeColor;
		this.height = height;
		this.hairColor = hairColor;
	}
	final public void describe() {
		System.out.println("eye color:" + this.eyeColor);
		System.out.println("height:" + this.height);
		System.out.println("hair color:" + this.hairColor);
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}
	
}

class MartianPerson extends Person{
	
	public MartianPerson() {
		this.eyeColor = "brown";
		this.height = 50;
		this.hairColor = "green";
	}
	public MartianPerson(String eyeColor, int height, String hairColor) {

		setDescription(eyeColor, height, hairColor);
	}
	
	
	//overriding
	@Override
	public void setDescription(String eyeColor, int height, String hairColor) {
		this.eyeColor = eyeColor;
		this.height = height;
		this.hairColor = hairColor;
	}
	
}
//abstraction tell us what a class needs to do, but not how to do it.
// abstractions let us group class behaviors in a more manageable way.

//the purpose of this interface is to collect methods that describe the Person.
interface IDescription{
	void describe();
	
}
interface IHeight{
   int getHeight();
}

abstract class Description{
	abstract void describe();
}
abstract class Height{
	abstract int getHeight();
}


