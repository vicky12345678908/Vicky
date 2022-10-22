package Test;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		if(a%2==0)
		{
			for(int b=1;b<=a*2-2;b=b+2)
			{	
				System.out.print(b);
				if(b<a*2-3)
				{
					System.out.print(",");
				}
			}
		}
		else
			{
				for(int b=1;b<=a*2-1;b=b+2)
				{	
					System.out.print(b);
					if(b<a*2-1)
					{
						System.out.print(",");
					}
				}
			}
	}
}
