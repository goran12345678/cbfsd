import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset is a collection that implements the Set interface
		//removes duplicate values and allows NULLS
		//HashSet<String> emails = new HashSet<String>();
		//LinkedHashSet<String> emails = new LinkedHashSet<String>();  //preserves the order
		TreeSet<String> emails = new TreeSet<String>();  //sorts the data
		emails.add("john@gmail.com");
		emails.add("jenni@yahoo.com");
		emails.add("leo@hotmail.com");
		emails.add("mike@pronto.com");
		emails.add("anna@terra.com");
		
		emails.add("jenni@yahoo.com");
		Iterator<String> itr = emails.iterator();
		while(itr.hasNext()) {
			String val = itr.next();
			//System.out.println(val);
		}
	
		//System.out.print("emails are: " + emails);
		PassWordChecker wdChecker = new PassWordChecker();
		//wdChecker.newPassword("password1");
		//wdChecker.newPassword("password1");
		
		AddressBook add = new AddressBook();
		add.addContact("Jenny");
		add.addContact("Mike");
		add.addContact("Leo");
		add.addContact("Anna");
		add.showContacts();
		
	}

}

class PassWordChecker{
	HashSet<String> passwords;
	public PassWordChecker() {
		this.passwords = new HashSet<String>();
	}
	public void newPassword(String password) {
		int s = this.passwords.size();
		this.passwords.add(password);
		if(this.passwords.size() == s) {
			System.out.println("Do not use password from the past");
		}else {
			System.out.println("You password was changed");
		}
	}
}

class AddressBook{
	TreeSet<String> names;
	public AddressBook() {
		this.names = new TreeSet<String>();
	}
	public void addContact(String name) {
		this.names.add(name);
	}
	public void showContacts() {
		Iterator<String> itr = this.names.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
}
