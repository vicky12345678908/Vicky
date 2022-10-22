package Test;
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
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