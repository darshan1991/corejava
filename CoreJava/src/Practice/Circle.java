package Practice;

import java.awt.Color;

public class Circle<DrawWindow, outline, fill> {

		private double r;
		
		public Circle (double r) {
			this.r = r;
			
		}
		public Circle()
		{
			r = 5;
		}
	
	public double area() {
		return 3.14*r*r;
	}
	public class GraphicCircle extends Circle<Object, Object, Object> {
		Color outline, fill;
		public void draw(DrawWindow dw) {
						}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle<Object, Object, Object> aCircle = new Circle<Object, Object, Object>(10);
double area = aCircle.area();
System.out.println(area);
	}
	}

