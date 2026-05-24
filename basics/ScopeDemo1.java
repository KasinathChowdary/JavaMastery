class ScopeDemo1
{
	void show()
	{
		System.out.println("Cannot access r here");
	}
	public static void main(String[] a)
	{
		int r=10;
		System.out.println("r="+r);
		show();
	}
	
	
}