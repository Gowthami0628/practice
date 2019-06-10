package methodoverloading;

public class DemoShape {

	public static void main(String[] args) {
		Shape cir = new Shape();
		System.out.println(cir.calculateArea(3.5));
		Shape rect = new Shape();
		System.out.println(rect.calculateArea(10, 20));
		Shape sqr = new Shape();
		System.out.println(sqr.calculateArea(4));

	}

}
