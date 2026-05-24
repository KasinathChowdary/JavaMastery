class VariableDemo
{
	int a=100; //instance object
	void display()
	{
		int b=50;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main( String[] a)
	{
		VariableDemo s=new VariableDemo();
		s.display();
	}
}