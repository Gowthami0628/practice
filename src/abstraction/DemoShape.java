package abstraction;

public class DemoShape {

	public static void main(String[] args) {
		Cylinder cyl = new Cylinder();
		Cube cube = new Cube();
		System.out.println(cyl.calculateVolume(10, 10));
		System.out.println(cube.calculateVolume(10, 10));

	}

}
