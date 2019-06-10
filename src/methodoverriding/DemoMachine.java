package methodoverriding;

public class DemoMachine {

	public static void main(String[] args) {
		Machine mac = new Machine(0);// it will call constructor from parent class
		mac.start();
		System.out.println("---------------");
		Car alto = new Car();// it will call constructor from both parent & child class
		alto.start();
		alto.accelerate();
		System.out.println("---------------");
		Machine bmw = new Car(); // it will also call constructor from both parent & child class
		bmw.start();
	}

}
