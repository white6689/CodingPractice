package D0113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11503 {
    static int[] numbers;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        numbers=new int[num];
        dp=new int[num];
        for(int i=0;i<num;i++)
            numbers[i]=sc.nextInt();
        for(int i=0;i<num;i++)
            rec(i);
        int result=dp[0];
        for(int i=1;i<num;i++)
            result=Math.max(result, dp[i]);
        System.out.println(result);
    }
    static int rec(int n){
        if(dp[n]==0){
            dp[n]=1;
            for(int i=n-1;i>=0;i--){
                if(numbers[n]>numbers[i]){
                    dp[n]=Math.max(dp[n], rec(i)+1);
                }
            }
        }
        return dp[n];
    }
}
