package D0110;

import java.util.Scanner;

public class Q2156 {
    static int[] dp;
    static int[] cost;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
            cost[i]=sc.nextInt();
        dp[1]=cost[1];
        if(num>=2)
            dp[2]=cost[2];
        for(int i=3;i<=num;i++)
            dp[i]=Math.max(dp[i-1], dp[i-2])+cost[i];
        System.out.println(dp[num]);
    }
}
