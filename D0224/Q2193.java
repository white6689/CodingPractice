package D0224;

import java.util.Scanner;

public class Q2193 {
    // 이친수 경우의 수 bottom-up 으로 풀어보기
    // 저장 할 값: 해당 자리 수까지 올 수 있는 모든 경우의 수, 0/1 나눠짐
    // 자리수? ____ 맨 왼쪽이 첫번째, 즉 이친수의 조건에 의해 항상 1만 가능
    static long dp[][];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new long[num+1][2];
        //첫번째 자리에 올 수 있는 건 1 뿐
        dp[1][0]=0;
        dp[1][1]=1;
        for(int i=2;i<=num;i++){
            //전에 온 숫자가 1이라면(그러한 경우의 수가 1이상) 나는 0만 가능해짐
            if(dp[i-1][1]>=1){
                //이 전의 수가 1인 경우의 수만 물려받아서 내 숫자가 0이 될때 경우의수를 더해줘야함
                dp[i][0]+=dp[i-1][1];
            }
            // 전에 온 숫자가 0이라면(그러한 경우의 수가 1이상) 나는 1, 0둘다 오는 것이 가능
            // 이전의 경우의 수(0에서 온것, 1에서 온것)모두를 이어받아야 함
            if(dp[i-1][0]>=1){
                dp[i][0]+=dp[i-1][0];
                dp[i][1]+=dp[i-1][0];
            }
        }
        System.out.println(dp[num][0]+dp[num][1]);
    }
}
