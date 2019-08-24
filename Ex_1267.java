import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, y=0, m=0, q, n=sc.nextInt(), s[] = new int[20];
		for(i=0;i<n;i++)
			s[i] = sc.nextInt();
		for(i=0;i<n;i++) {
			q = s[i]/30;
			if(s[i]%30>=0)
				y+=10;
			y+=q*10;
			q = s[i]/60;
			if(s[i]%60>=0)
				m+=15;
			m+=q*15;
		}
		if(y==m)
			System.out.print("Y ");
		System.out.printf("%c %d", y < m ? 'Y' : 'M', y < m ? y : m);
		sc.close();
	}
}
