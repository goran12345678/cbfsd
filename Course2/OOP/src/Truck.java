
public class Truck extends  Tow /*implements ITow*/ {
	boolean fourWheelDrive = true;
	int liftHeight = 6;
	int weight;
	int height;
	boolean doesTow;
	@Override
	boolean doesTow() {
		// TODO Auto-generated method stub
		System.out.println("Does tow " + true);
		return true;
	}
	
	//overriding
	/*public void turn(int degree) {
		directionOfTravel = degree;
		System.out.println("Turning truck");
	}*/

	//implement interface
	/*@Override
	public boolean doesTow() {
		// TODO Auto-generated method stub
		System.out.println("Does tow " + true);
		return true;
	}*/
}
