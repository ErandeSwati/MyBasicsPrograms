package practice;

public class Scooter extends Vehicle {

	Scooter(int aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter s=new Scooter(10);
		s.start();
		s.display();
		
		Car c=new Car(10);
		c.start();
		c.display();
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Scooter");
	}

}
abstract class Vehicle
{
	abstract void start();
	int a;
	void display()
	{
		System.out.println("display");
	}
	Vehicle(int aa)
	{
		System.out.println("Vehicle constructors");
	}
}
 class Car extends Vehicle
 {

	Car(int aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("CAR");
	}
	 
 }