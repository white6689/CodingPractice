package D0113;

import java.util.Scanner;

public class Q11722 {
    static int[] numbers;
    static int[] dp;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        numbers=new int[num];
        dp=new int[num];
        for(int i=0;i<num;i++)
            numbers[i]=sc.nextInt();
        for(int i=0;i<num;i++)
            rec(i);
        int max=dp[0];
        for(int i=1;i<num;i++)
            max=Math.max(max, dp[i]);
        System.out.println(max);
    }
    static int rec(int n){
        if(dp[n]==0){
            dp[n]=1;//최소 길이:자기자신을 갖는 수열:1
            for(int i=n-1;i>=0;i--){
                if(numbers[n]<numbers[i])
                    dp[n]=Math.max(dp[n], rec(i)+1);
            }
        }
        return dp[n];
    }
}
