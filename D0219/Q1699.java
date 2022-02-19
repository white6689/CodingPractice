package D0219;

import java.util.Scanner;

public class Q1699 {
    static Integer dp[];
    static int size=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new Integer[n+1];
        dp[0]=0;
        dp[1]=1;
        find(n);
        System.out.println(size);
    }
    static int find(int num){
        int sqrt_num=0;
        if(num>=1){
            if(dp[num]==null){
                sqrt_num=(int)Math.sqrt(num);
                dp[num]=sqrt_num;
            }
            ++size;
            return find(num-(int)Math.pow(dp[num], 2));
        }else
            return 1;
    }
}
