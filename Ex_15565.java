import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils;

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
		
		int[] lion = new int[1000000];
		int m = 0;
		
		if(dolls.length() >0)
		{
			int l = -1, i = 0;
			do
			{
				l = dolls.indexOf("1", l + 1);
				lion[m] = l;
				m++;
				i++;
			}while(l+1 < dolls.length() && l != -1);
			for (i = 0; i < N; i++)
			{
				System.out.println("lion["+ i+ "]의 값 : " +lion[i]);
				if(lion[i]==-1)
				{
					break;
				}
			}
		}
		//int count = StringUtils.countMatches(dolls,"1");
		int count = 0;
		int fromIndex = -1;

		while ((fromIndex = dolls.indexOf("1", fromIndex + 1)) >= 0)
		{
			count++;
		}
		System.out.println("1이 몇개 있는가 =");
	    System.out.println(count);     // 1의 갯수
		
	    if(count < K)
		{
			System.out.println(-1);     // 적다면!
		} 
		else
		{
			int[] array = new int[count-2];
			for (int n = 0; n < count-K+1; n++)
			{
				int size = lion[K-1+n] - lion[n] + 1;
				
				array[n] = size;
				System.out.println("집합의 크기 =");
				System.out.println(array[n]);     // 집합의 크기
			}
			
			for ( int r = 0; r < count-K+1; r++)
			{
				System.out.println("array["+ r+ "]의 값");
				System.out.println(array[r]);
			}

			int min = array[0];
			System.out.println(array.length);
	        for(int i=0 ; i < array.length; i++)
	        {
	            if(array[i] <= min)
	            {
	                min = array[i];
	            }
	            System.out.println("지금까지 최소 =");
	            System.out.println(min);
	        }
	        
			
		}
	}
}
