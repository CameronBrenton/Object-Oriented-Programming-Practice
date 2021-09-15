public class TestCircle {
	public static void main(String[] args){
		Circle c1 = new Circle();
		System.out.println("The circle has a radius of "
		+ c1.getRadius() + " and an area of " + c1.getArea());
		Circle c2 = new Circle(2.0);
		System.out.println("The circle has a radius of "
		+ c2.getRadius() + " and an area of " + c2.getArea());
		Circle c3 = new Circle(3.0);
		System.out.println("The circle has a radius of "
		+ c3.getRadius() + ", an area of " + c3.getArea() +
		" and a circumference of " + c3.getCircumference());
		Circle c4 = new Circle(4.0, "green");
		System.out.println("The circle has a radius of "
		+ c4.getRadius() + " and has the color " + c4.getColor());
		c4.setRadius(5.0);
		System.out.println("The radius is: " + c4.getRadius());
		c4.setColor("blue");
		System.out.println("The color is: " + c4.getColor());
		
		c4.toString();
		System.out.println(c4);
		System.out.println("Operator '+' invokes toString() too: " + c4);
	}
}
