package project;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static int N, dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new int[N+1];
        java.util.Arrays.fill(dp, -1);
        dp[0] = dp[1] = 0;
        System.out.println(solve(N));
        sc.close();
        }
    
    public static int solve(int pos){
        if(dp[pos]!=-1) return dp[pos];
        
        int i, min = 0x7fffffff;
        if(pos%3 == 0) min = Math.min(min, solve(pos/3));
        if(pos%2 == 0) min = Math.min(min, solve(pos/2));
        min = Math.min(min, solve(pos - 1));
        
        return dp[pos] = min + 1;
    }
}
