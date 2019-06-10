package abstraction;

public class Cylinder extends Shape{

	@Override
	public double areaofBase(int side) {
		
		return Math.PI*side*side;
	}

}
