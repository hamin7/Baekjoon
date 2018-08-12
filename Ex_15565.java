import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_15565
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		String dolls ;
		for (int i = 0; i < N; i++)
		{
			dolls = sc.next();
		}
		sc.close();
		
		for (int j = 0; j < N; j++)
		{
			System.out.println(dolls);
		}
		
		int[] lion = new int[1000000];
		int k;
		lion[k] = dolls.indexOf("1");
		
		if(dolls.length() >0)
		{
			int l, i =0;
			do
			{
				l = dolls.indexOf("1", l + 1);
				System.out.println(i + "번 째 위치 : " +l);
			}while(l+1 < dolls.length && l != -1);
		}
	}
}
