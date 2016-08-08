import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle {

	private double radius;

	public Circle() {
		radius = 0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/*
	 * NumberFormat currency = NumberFormat.getCurrencyInstance(); String
	 * circumferenceFormatted = currency.format (getCircumference()); {
	 * 
	 * } String formattedArea;
	 * 
	 * void setformattedArea (String formatteda){ formattedArea = formatteda; }
	 * 
	 * String numberFormat = currency.format(getNumber());{
	 */

	public double getCircumference() {
		return calculateCircumference();
	}

	private double calculateCircumference (){
		return radius;
	    	
	}
	
	double roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d)) * Math.PI * radius;

	}

	public double getArea() {
		return calculateArea();
	}

	private double calculateArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "The radius of the circle is: " + radius + ", and the area is: " + calculateArea();
	}

	private String formatNumber(double x) {

		NumberFormat sc = NumberFormat.getNumberInstance();
		sc.setMaximumFractionDigits(2);
		String format = sc.format(x);
		return format;

	}
}
