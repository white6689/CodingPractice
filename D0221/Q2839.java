package D0221;

import java.util.Scanner;

public class Q2839 {
    static Integer dp[];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new Integer[num+1];
        dp[0]=0;
        dp[1]=-1;
        if(num>=2)
            dp[2]=-1;
        System.out.println(find(num));
    }
    static int find(int n){
        if(n<0){
            return -1;
        }
        if(dp[n]==null){
            int five=find(n-5);
            int three=find(n-3);
            if(five==-1 && three==-1){
                dp[n]=-1;
            }else if(five==-1 && three!=-1)
                dp[n]=three+1;
            else if(five!=-1&&three==-1)
                dp[n]=five+1;
            else
                dp[n]=Math.min(five, three)+1;
        }
//        System.out.println("Number: "+ n+", DP: "+dp[n]);
        return dp[n];
    }
}
