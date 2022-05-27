
public class Rectangle {
	private double length;
	private double width;
	
	
	public void setLength(double length) {
		this.length=length;
	}
	
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	
	public double getLength() {
		return length;
	}
	
	
	public double getWidth() {
		return width;
	}
	
	
	public double getArea() {
		return length*width;
	}
	
	
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public static int compareArea(Rectangle rec1, Rectangle rec2) {
		if(rec1.getArea()>rec2.getArea()) {
			return 1;
		}else if (rec1.getArea()<rec2.getArea()){
			return -1;
		}else {
			return 0;
		}
	}
	
}
