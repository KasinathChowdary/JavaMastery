class Product
{
	int id;
	String name;
	double price;
	Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public static void main(String[] a)
	{	Product[] cart=new Product[4];
		cart[0]=new Product(1,"chips",50);
		cart[1]=new Product(2,"chocolate",100);
		cart[2]=new Product(1,"Atta",60);
		cart[3]=new Product(2,"Milk",100);
		double total=0;
		for(Product p:cart)
		{
			total +=p.price;
		}
		System.out.println("Total cost:"+total);
		Product ref=cart[2];
		System.out.println("Referenced Product:"+ref.name);
	}
}