package methodoverloading;

public class Shape {	
        //are of the circle	
		public double calculateArea(double radius) {
			
			double area;
			area = Math.PI*radius*radius;
			return area;
		}
		//are of the rectangle
		public double calculateArea(int length , int width) {
			
			double area;
			area = length*width;
			return area;
		}
		//are of the square
		public double calculateArea(int side) {
					
			double area;
			area = side*side;
			return area;
		}
	}
