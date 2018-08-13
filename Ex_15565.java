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
		
		dolls = sc.next();
		
		sc.close();
		
		for (int j = 0; j < N; j++)
		{
			System.out.println(dolls);
		}
		
		int[] lion = new int[1000000];
		int m = 0;
		
		
		if(dolls.length() >0)
		{
			int l=-110, i = 0;
			int a = dolls.length();
			do
			{
				l = dolls.indexOf("1", l + 1);
				lion[m] = l;
				m++;
				System.out.println(i + "번 째 위치 : " +l);
			}while(l+1 < dolls.length() && l != -1);
		}
	}
}
