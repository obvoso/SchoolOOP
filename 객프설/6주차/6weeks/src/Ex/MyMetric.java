package Ex;

public class MyMetric {
	
	public static double kiloToMile(double km) {
		return (km / 1.6093);
	}
	
	public static double mileToKilo(double mile) {
		return (mile * 1.6093);
	}
	
	public static void main(String[] args) {
		System.out.println("1km를 마일로 바꾸면 " + kiloToMile(1));
	}
}
