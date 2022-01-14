package D0111;

import java.util.Scanner;

public class Q2156 {
    static Integer[] dp;
    static Integer[] cost;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        cost=new Integer[num+2];
        dp=new Integer[num+2];
        for(int i=2;i<num+2;i++){
           cost[i]=sc.nextInt();
        }
        dp[1]=cost[1]=dp[0]=cost[0]=0;
        for(int i=3;i<=num+1;i++){
            dp[i]=Math.max(dp[i-2]+cost[i],dp[i-3]+dp[i-1]+cost[i] );
            dp[i]=Math.max(dp[i-2]+cost[i],dp[i-3]+dp[i-1]+cost[i] );
        }
        System.out.println(dp[num]);

    }
}
