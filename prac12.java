import java.util.Scanner;

public class prac12 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int kishore[]=new int[n];

        for(int i=0;i<n;i++) {
        	kishore[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++) {
        	System.out.println(kishore[i]);
	}
}
}

