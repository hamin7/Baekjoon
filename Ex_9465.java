import java.util.*;

class Main {
	public static int T; // number of case
	public static int[][] Value;// values of sticker set
	public static int[][] dp;

	public static int sticker(int N, int col, int stat) {
		if (col == N)
			return 0;
		if (dp[col][stat] != -1)
			return dp[col][stat];

		else {
			int result = sticker(N, col + 1, 0);
			if (stat != 1)
				result = Math.max(result, sticker(N, col + 1, 1) + Value[0][col]);
			if (stat != 2)
				result = Math.max(result, sticker(N, col + 1, 2) + Value[1][col]);

			dp[col][stat] = result;

			return result;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for (int test_case = 0; test_case < T; test_case++) {

			// initialize 'Value' array with int 101 cf) value scope : 0~100
			int N = sc.nextInt();
			Value = new int[2][N];
			dp = new int[N+1][3];
			
			//get input values
			for(int i = 0; i<2; i++) {
				for(int j = 0; j <N; j++) {
					Value[i][j] = sc.nextInt();
				}
			}

			// initialize 'dp' array with int -1
			for (int i = 0; i < N+1; i++) {
				for (int j = 0; j < 3; j++) {
					dp[i][j] = -1;
				}
			}
			System.out.println();
			System.out.println(sticker(N, 0, 0));
		}
		sc.close();

	}

}
