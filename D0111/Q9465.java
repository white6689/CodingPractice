package D0111;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q9465 {
    static Integer[][] dp;
    static Integer[][] cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int num=Integer.parseInt(br.readLine());
            dp=new Integer[2][num+1];
            cost=new Integer[2][num+1];
            for(int j=0;j<2;j++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int k=1;k<num+1;k++){
                    cost[j][k]=Integer.parseInt(st.nextToken());
                }
            }
            dp[0][1]=cost[0][1];
            dp[1][1]=cost[1][1];
            for(int k=2;k<=num;k++){
                dp[0][k]=Math.max(dp[1][k-1], dp[1][k-2])+cost[0][k];
                dp[1][k]=Math.max(dp[0][k-1], dp[0][k-2])+cost[1][k];
            }
            System.out.println(Math.max(dp[0][num], dp[1][num]));
        }

    }
}
