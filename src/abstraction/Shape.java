package abstraction;

public abstract class Shape {
	
	public double calculateVolume(int side , int height) {
		double volume;
		volume = areaofBase(side) * height;
		return volume;	
	}
	public abstract double areaofBase(int side);

}
