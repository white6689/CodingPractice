package D0113;

import java.util.Scanner;

public class Q11055 {
    static int[] dp;//각 element 까지의 수열의 최대 합을 저장하는 곳
    static int[] numbers;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new int[num];
        numbers=new int[num];
        for(int i=0;i<num;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++)
            rec(i);
        int max=dp[0];
        for(int i=1;i<num;i++)
            max=Math.max(max, dp[i]);
        System.out.println(max);

    }
    static int rec(int n){
        if(dp[n]==0){//탐색하지 않은 곳이라면!
            dp[n]=numbers[n];
            for(int i=n-1;i>=0;i--){
                if(numbers[n]>numbers[i]){//numbers[n] 전에 올 element 찾기(수열!)
                    dp[n]=Math.max(dp[n], dp[i]+numbers[n]);
                }
            }
        }
        return dp[n];
    }
}
