
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		Truck truck = new Truck(); //Single Inheritanced
		
		//truck.turn(3);

		
		MonsterTruck monster = new MonsterTruck(); //Multi level inheritance
		//Multiple Inheritance. When a class extends two or more other classes.
		
		monster.turn(3);
		
		//ITow iTow = new Truck();
		
		//truck.doesTow;
		//iTow.doesTow();
		truck.doesTow();
   
	}

}
