
public class Maxno 
{
	public static void main(String[] args) 
	{
		int a[]={11,22,33,44,55,66};
		int max=a[0];
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum="+max);

	}

}
