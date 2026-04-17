import java.util.Scanner;

class prac5
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 int scan=scan.nextInt();

		 for(int i=1;i<=n;i++)
		 {
			for(int j=1;j<=1;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j<=2*(n-i)+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		 }
		
	}

} 