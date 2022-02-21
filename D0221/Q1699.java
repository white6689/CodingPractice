package D0221;

import java.util.Scanner;

public class Q1699 {
    static Integer dp[];// 최소항의 갯수를 저장
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new Integer[num+1];
        dp[0]=0;
        dp[1]=1;

        // 최댓값은 1로만 구성된 나
        // 비교는 1부터 증가하는 값을 내꺼에다가 -해줘야한다. 처음부터 큰 값으로 비교하면 안됨
        for(int i=1;i<=num;i++){
            dp[i]=i;
            System.out.println("first loop i: "+i+", dp[i]: "+dp[i]);
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i], dp[i-j*j]+1);
                System.out.println("second loop j: "+j+", i-j*j: "+(i-j*j));
            }
        }
        System.out.println(dp[num]);
    }
}
