
public class Car {
	String color;
	int numDoors;
	String transmission;
	int engineSize;
	int currentSpeed;
	int directionOfTravel;
	public void accelerate(int acceleration) {
		currentSpeed = acceleration * 3;
	}
	public void decelerate(int brakingForce) {
		currentSpeed = brakingForce * 5;
	}
	public void turn(int degree) {
		directionOfTravel = degree;
		System.out.println("Car truck");
	}
	public void turn(int degree, boolean isLeft) {
		if(isLeft == true) {
			directionOfTravel = 360 - degree;
		}else {
			directionOfTravel = degree;
		}
	}
}
