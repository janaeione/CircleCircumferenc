import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class CalculateCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Calculate a Circle's Circumference and Area!");

		System.out.println("Enter a Radius:");
		double radius = sc.nextDouble();

		Circle c = new Circle();
		
		
		
		c.setRadius(radius);
		System.out.println(c.getRadius());
		//System.out.println(c.getformat());
		System.out.println("Circumference: " + c.getCircumference());
		System.out.println("Area: " + c.getArea());
		//System.out.println(c.getFormat());
			
	}
}