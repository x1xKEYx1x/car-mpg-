public class CarDriver
{
	public static void main(String[]args)
	{
		Car c = new Car(39);
		c.setGas(16);
		c.drive(34.6);
		
		System.out.println("There are " + String.format("%.2f",c.getGas()) +  " gallons");
		
	}
}