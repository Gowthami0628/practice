package methodoverriding;

public class Machine {
	
    int engineSize;
	public Machine(int engineSize) {       // explicit Constructor
		this.engineSize = engineSize;
     System.out.println("Constructor from parent class");
	}
	
	public void start () {
		System.out.println("Start Method from Machine class");
	}
	public void stop () {
		System.out.println("Stop Method from Machine class");
	}
	public void restart () {
		System.out.println("Restart Method from Machine class");
	}

}
