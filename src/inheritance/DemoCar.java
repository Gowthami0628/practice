package inheritance;

public class DemoCar {

	public static void main(String[] args) {
		//Object created for parent class will have access to the methods available in parent class ONLY
		Machine mac = new Machine();
		mac.start();
		mac.stop();
		mac.restart();
		//Object created for child class will have access to both the methods created from parent class and child class
		Car alto = new Car();
		alto.start();
		alto.stop();
		alto.accelerate();
		alto.deaccelerate();
		alto.accelerate();
		alto.deaccelerate();
		//We have created a reference of machine class and initialized it with Car class
		//it will have access to the methods from Machine class only
		//Method calling happens at compile time
		//Objects created at run time
		Machine bmw = new Car();
		bmw.start();
		bmw.stop();
		bmw.restart();
	}

}
