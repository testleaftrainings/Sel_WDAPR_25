package week2.day4;

public class Maruthi extends Car {
	// modelName, serviceCenter
	public void modelName() {
		System.out.println("Baleno");
	}
	public void serviceCenter() {
		System.out.println("Free services");
	}
	public void brake() {
		super.brake();
		System.out.println("ABS Brakes were implemented here");
	}
	public static void main(String[] args) {
		Maruthi mrt = new Maruthi() ;// Declared // Initialized the memory
		mrt.modelName();
		mrt.serviceCenter();
		mrt.brake();
		mrt.horn();
		mrt.steeringWheel();
		mrt.headLight();
		mrt.noOfWheel();
		mrt.maxPassenger();
		mrt.noOfWheel=5;
		System.out.println(mrt.noOfWheel);
	}
	
	

}
