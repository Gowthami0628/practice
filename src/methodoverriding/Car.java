package methodoverriding;

public class Car extends Machine {
	
	public Car() {
		super(4000);
		System.out.println("I am a constructor from car class");
	}
	
	public void accelerate () {
		System.out.println("Accelerate Method from Car class");
	}
	public void deaccelerate () {
		start(); // method from super class
		engineSize = 700; // variable from super class
		System.out.println("deaccelerate Method from Car class");
	}
	@Override
	public void restart () {
		System.out.println("Restart Method from Car class");
	}

}
