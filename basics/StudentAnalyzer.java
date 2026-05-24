public class StudentAnalyzer
{
    String[] names;
    int[] marks;
    StudentAnalyzer(String[] names,int[] marks)
    {
        this.names=names;
        this.marks=marks;
    }
    String findTopper()
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
        return names[index];
    }
    int getHighestScore()
    {
        int max=marks[0];
        for(int m:marks)
        {
            if(m>max) max=m;
        }
        return max;
    }
}
class Student {
    public static void main(String[] args) {
        String[] names={"Kasi","Bheem","charan"};
        int[] marks={99,97,98};
        StudentAnalyzer s1=new StudentAnalyzer(names,marks);
        System.out.println("Name:"+s1.findTopper()+"Score:"+s1.getHighestScore()
);
    }
}