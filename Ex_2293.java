import java.util.*;

public class Ex_2293 {
	public static void main(String[] args) {
    int i, j;
    int[] d = new int[1001];
    int[] a = new int[1001];
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    for (i = 1; i <= n; i++){
      a[i] = sc.nextInt();
    }
    d[0] = 1;
    for (i = 1; i <= n; i++){
      for (j = a[i]; j <= k; j++){
        d[j] += d[j - a[i]];
      }
    }
    System.out.println(d[k]);
	}
}
