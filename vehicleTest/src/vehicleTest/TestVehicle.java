package vehicleTest;

class Vehicle{
	public void startEngine() {
		System.out.println("Starting the engine of the vehicle");
	}
}
class Car extends Vehicle{
	public void startEngine() {
		System.out.println("Starting the engine of the Car with the key");
	}
}
class MotorCycle extends Vehicle{
	public void startEngine() {
		System.out.println("Starting the engine of the motorCycle with the kick start");
	}
}
public class TestVehicle {
	public static void testVehicle(Vehicle vehicle) {
		vehicle.startEngine();
	}
	public static void main(String[] args) {
		Vehicle car=new Car();
		Vehicle motorCycle=new MotorCycle();
		
		System.out.println("Test driving the Car");
		testVehicle(car);
		
		System.out.println("Test driving the MotorCycle");
		testVehicle(motorCycle);
	}

}
