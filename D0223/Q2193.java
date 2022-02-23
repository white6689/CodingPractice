package D0223;

import java.util.Scanner;

public class Q2193 {
    static long dp[];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new long[num+1];
        dp[0]=0;
        dp[1]=1;
        if(num>=2)
            dp[2]=1;
        System.out.println(find(num));
    }
    static long find(int n){
        if(dp[n]==0){
            dp[n]=find(n-1)+find(n-2);
        }
        return dp[n];
    }
}
