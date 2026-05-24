class InstanceLocalVariable
{
	int a=100; //instance variable
	void display()
	{
		int b=50; //local variable
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args)
	{
		InstanceLocalVariable v=new InstanceLocalVariable();
		v.display();
	}
}