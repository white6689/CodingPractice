package D0113;

import java.util.Scanner;

public class Q11504 {

    static int[][] dp;
    static int[] numbers;
    static int num;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        dp=new int[num][num];
        numbers=new int[num];
        for(int i=0;i<num;i++)
            numbers[i]=sc.nextInt();
        for(int i=0;i<num;i++){
            rec(i, 0);
            rec(i, 1);
        }
        int max=dp[0][0]+dp[1][0];
        for(int i=1;i<num;i++)
            max=Math.max(max, dp[0][i]+dp[1][i]);
        System.out.println(max-1);
    }
    static int rec(int n, int val){
        if(dp[val][n]==0){//탐색하지 않은 곳이라면 음...
            dp[val][n]=1;
            if(val==0){//왼쪽 부분을 볼거라면
                for(int i=n-1;i>=0;i--)
                    if(numbers[n]>numbers[i])
                        dp[val][n]=Math.max(dp[val][n], rec(i, val)+1);
            }
            else if(val==1){//오른쪽을 볼거라면
                int temp=numbers[num];
                for(int i=num;i>=n;i--)
                    if(numbers[num]>numbers[i])
                        dp[val][num]=Math.max(dp[val][num], rec(i, val)+1);
            }
        }
    }
    static int rec_right(int nums, int n){
        if(dp[1][n]==0){
            dp[1][nums]=0;

        }
    }
}
