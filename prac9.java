import java.util.*;

class prac9
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
              for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*i;j++)
            {
                System.out.print(" ");
            }
              for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }

            System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        }



    }
}