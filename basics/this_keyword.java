/*this  this key word is used for the access the instance variable

this keyword used to refer to the current object.

"this" can be used to resolve any name collisions that might occur between instance variables and formal variables.

this hides the instance variables*/

class Box
{
	double w=5,h=5,d=5;
	Box(double w, double h, double d)
	{
		w=w
		h=h
		d=d
	}
}
class Box1
{
	public static void main(String[] args)
	{
		Box b=new Box(1,2,3);
		System.out.println("Volume:"+b.volume());
	}
}


