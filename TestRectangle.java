public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 15);
		System.out.println("The area of r1 is " + r1.getArea()
		+ "and the perimeter is " + r1.getPerimeter());

		Rectangle r2 = new Rectangle(7, 13);
		System.out.println("The area of r2 is " + r2.getArea()
		+ " and the perimeter is " + r2.getPerimeter());
	}	
}
