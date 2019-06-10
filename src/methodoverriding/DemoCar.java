package methodoverriding;

public class DemoCar {

	public static void main(String[] args) {
		Machine mac = new Machine(1000);
		mac.start();
		mac.stop();
		mac.restart();//restart method from machine class will be called since the object created is reference of parent[machine] class
		
		System.out.println("-------------------------------");
		Car alto = new Car();
		alto.start();
		alto.stop();
		alto.restart();//restart method from car class will be called since the object created is reference of Car[Child] class
		alto.accelerate();
		alto.deaccelerate();
		alto.accelerate();
		alto.deaccelerate();
		System.out.println("-------------------------------");
		Machine bmw = new Car();
		bmw.restart(); //restart method from car class will be called.
		//Calling a method will always dependent on right part 
	}

}
