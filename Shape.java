package homework8;

public class Shape {
	public void calculateArea() {
		System.out.println("Calculating area...");
	}
public double area() {
	return 0;
}
public double perimeter() {
	return 0;
}
}
//till here we are creating the main class and then  we are extending the given requiremnent
class Circle extends Shape{
	private double radius;
	 public Circle(double radius) {
		 this.radius=radius;
	 }
@Override
public double area() {
	super.calculateArea();
	//we used the super class method to get the result
	return Math.PI *radius *radius;
}
@Override
public double perimeter() {
	return 2 *Math.PI *radius;
}
}
class Rectangle extends Shape{
	private double length;
	private double width;
	 public Rectangle (double length, double width) {
	this.length=length;
	this.width=width;
	 }
@Override
public double area() {
	super.calculateArea();
	//we used the super class  method
	return length*width;	
}
@Override
public double perimeter() {
	return 2 *( length+width);	
}
}
	
	
