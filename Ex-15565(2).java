import java.util.*;
public class Ex_15565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue q= new LinkedList();
		int[] a = new int[n];
		for(int i=0 ; i<n ; i++) {
			a[i]=sc.nextInt();
		}
		int o=-1;
		int t;
		for(int i=0 ; i<n ; i++) {
			if(a[i]==1)
				q.offer(i);
			if(q.size()>=k) {
				t=i-(int)q.poll()+1;
				if(o==-1) {
					o=t;
				}else
					o=o<t?o:t;
			}
		}
		System.out.println(o);
	}
}
