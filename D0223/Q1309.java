package D0223;

import java.util.Scanner;

public class Q1309 {
    static int dp[][];
    static int n;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final int MOD=9901;
        n=sc.nextInt();
        dp=new int[n+1][3];
        dp[1][0]=1;
        dp[1][1]=1;
        dp[1][2]=1;
        for(int i=1;i<=n;i++){
            //전 줄 상관없음
            dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%MOD;
            //이번에는 왼쪽칸에 넣고 싶은데, 그럴러면 이전 줄에는 없거나 오른쪽
            dp[i][1]=(dp[i-1][0]+dp[i-1][2])%MOD;
            //이번에는 오른쪽 칸에 넣고 싶은데, 그럴러면 이전 줄에는 없거나 왼쪽에 있는 상태여야함
            dp[i][2]=(dp[i-1][0]+dp[i-1][1])%MOD;
        }
        long result=0;
        for(int i=0;i<3;i++)
            result=(result+dp[n][i])%MOD;
        System.out.println(result);
    }
}
