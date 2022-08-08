import java.util.*;
public class first {
	public static void fctn(String a)
	{
		//int n=20;//a.length()>b.length()?a.length():b.length();
		Set <Character> s= new HashSet<>(); 
		char[] ch1=a.toCharArray();
//		char[] ch2=a.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
		int max=0;
		char r = 0;
		for(int i=0;i<ch1.length-1;i++)
		{
			int c=0;
			for(int j=1;j<ch1.length;j++)
			{
				 if(ch1[i]==ch1[j])
				 {
					 c++;
					 if(c>max)
					 {
						 max=c;
						 r=ch1[i];
					 }
				 }
					 
			}
			System.out.println(r+" occours "+max);
		}
	}

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 String s1=sc.next();
		 
		 fctn(s1);

	}

}
