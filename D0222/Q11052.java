package D0222;

import java.util.Scanner;

public class Q11052 {
    static Integer dp[];
    static int input[];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new Integer[n+1];
        input=new int[n+1];
        for(int i=1;i<=n;i++){
            input[i]=sc.nextInt();
        }
        input[0]=dp[0]=0;
        dp[1]=input[1];

        //bottom up
        for(int i=2;i<=n;i++){
            int max=input[i];//임시로 max 값을 자기값으로 정해두기
            for(int j=1;j<i;j++)
                max=Math.max(max, dp[i-j]+input[j]);
            dp[i]=max;
            System.out.println("dp["+i+"]"+"="+dp[i]);
        }
        //System.out.println(find(n));
    }
    public static int find(int n){
        System.out.println("First enter n= "+n);
        if(dp[n]==null){
            int max=-1;
            max=Math.max(find(n-1)+input[1], input[n]);
            for(int i=2;i<=n/2;i++)
                max=Math.max(max, input[i]+input[n-i]);
            dp[n]=max;
        }
        System.out.println("dp["+n+"] = "+dp[n]);
        return dp[n];
    }
}
