package D0112;

import java.util.Scanner;

public class Q2579 {
    static Integer[] dp;
    static Integer[] cost;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new Integer[num+1];
        cost=new Integer[num+1];
        for(int i=1;i<=num;i++)
            cost[i]=sc.nextInt();
        cost[0]=dp[0]=0;
        dp[1]=cost[1];
        if(num>=2)
            dp[2]=cost[2];
        for(int i=3;i<=num;i++)
            dp[i]=Math.max(cost[i-1]+dp[i-3], dp[2])+cost[i];
        System.out.println(dp[num]);
    }
}
