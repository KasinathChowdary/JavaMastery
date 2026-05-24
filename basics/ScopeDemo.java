class ScopeDemo
{
	public static void main(String[] a)
	{
		int r=10;
		System.out.println(r);
		show();
	}
	static void show()
	{
		System.out.println("Cannot access r here, Because it is local to main");
	}
}