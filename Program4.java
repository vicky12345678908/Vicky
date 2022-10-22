package Test;

public class Program4 {
	public static void m1(int []num) {
		
		for (int a=1;a<10;a++)
		{
			int count = 0;
			for(int b=0; b<num.length;b++)
			{
				if(num[b]%a==0)
				{
					count++;
				}
			}
			System.out.println(a+":"+count);
		}
		}
		public static void main(String[] args) {
			int[] array = {1,2,8,9,12,46,76,82,15,20,30};
			m1(array);
		}
}