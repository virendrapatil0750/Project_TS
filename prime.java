// prime number
import java.util.Scanner;

public class prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = 100;
		
		for(int i = 1;i<=a;i++)
		{
			int count = 0;
			for(int j = 1; j<=i;j++)
			{
				int b = i%j;
				if(b==0)
					count++;
			}
			if(count < 3)
				System.out.println(i+" Prime number");
		}
	}
}