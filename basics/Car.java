class Car
{
	int speed=150;
	class Engine
	{
		void boost()
		{
			speed+=40;
		}
	}
	class Tyres
	{
		void grip()
		{
			speed+=10;
		}
	}
	void modify()
	{
		Engine e=new Engine();
		Tyres t=new Tyres();
		e.boost(); t.grip();
		System.out.println(speed);
	}
	public static void main(String [] args)
	{
		Car c=new Car();
		c.modify();
	}
}