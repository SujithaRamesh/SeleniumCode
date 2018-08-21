package learningjava;

class Vehicle
{
	public Vehicle()
	{
		System.out.println("Class: Vehicle");
	}
}
class Car extends Vehicle
{
	public Car()
	{
		System.out.println("Class: Car");
	}
	public void vehicleType()
	{
		System.out.println("Vehicle Type: Car");
	}
	public void speed()
	{
		System.out.println("Speed: 80kmph");
	}
}
public class Audi extends Car {
	public Audi()
	{
		System.out.println("Class: Audi");
	}
	public void brand()
	{
		System.out.println("Brand: Audi");
	}
	public void speed()
	{
		System.out.println("Speed: 90kmph");
	}
	public static void main(String[] args) {
		Audi a = new Audi();
		a.vehicleType();
		a.brand();
		a.speed();
	}
}