package D0110;

import java.util.Scanner;

public class Q2193 {
    static long [] dp;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new long[num+1];
        dp[0]=0;
        dp[1]=1;
        System.out.println(rec(num, 1));//처음은 항상 1부터 시작하니까
    }
    static long rec(int num, int val){
        if(dp[num]==0) {//메모이제이션 사용을 위해
            if (val == 0)
                dp[num] = rec(num - 1, 0) + rec(num - 1, 1);
            else if (val == 1)
                dp[num] = rec(num - 1, 0);
        }
        return dp[num];

    }


}
