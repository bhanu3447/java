import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter lines");
	    int n=scn.nextInt();
		for (int i=1 ;i<=n; i++ )
		{
			int num=i;
			for (int j=1;j<=n; j++ )
			{
              System.out.print(num);
			  if (j>=i) num++;
			  else num--;
			}
			System.out.println();
		}
	}
}