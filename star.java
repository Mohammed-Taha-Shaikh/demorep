import java.util.*;
class star
{
public static void main(String [] args)
	{
	int a= 5,h,i,j,z;
	String b= Integer.toString(a);
	for(i=a;i>0;i--)	
		{
		for(j=0;j<a;j++)
			{	
			for(h=0;h<a;h++)
				{
				System.out.print(j);
				System.out.print("*");
				for(z=i;z>0;z--)
					{
					System.out.print("_");
					}
				System.out.println("*");
				}	
			break;
			}
		}
	}
}