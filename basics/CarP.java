class Car
{
	static int speed =60;
	static class Engine
	{
		void boost()
		{
			speed+=40;
		}
	}
	static class Tyres
	{
		void grip()
		{
			speed+=10;
		}
	}
	void display()
	{
		System.out.println("Speed="+speed);
	}
}

class CarP
{
	Car c1=new Car();
	Car.Engine e1=c1.new Engine();
	Car.Tyres t1=c1.new Tyres();
	e1.boost();
	t1.grip();
	c1.display();
}
