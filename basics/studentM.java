class StudentAnalyzer
{
	String[] names;
	int[] marks;
	StudentAnalyzer(String[] names, int[]marks)
	{
		this.names=names;
		this.marks=marks;
	}
	void FindTopper()
	{
		int max=marks[0];
		int index=0;
		for(int i=1;i<marks.length;i++)
		{
			if(marks[i]>max)
			{
				max=marks[i];
				index=i;
			}
		}
		System.out.println("Name="+names[index]);
		System.out.println("Marks="+max);
		
	}
}
public class StudentM
{
	public static void main(String[] a)
	{	String[] names={"Kasinath","Jashwanth","Bhimesh"};
		int[] marks={99,92,90};
		StudentAnalyzer s1=new StudentAnalyzer(names,marks);
		s1.FindTopper();
	}
}
