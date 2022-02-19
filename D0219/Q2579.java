package D0219;

import java.util.Scanner;

// 계단 오르기, 기억이 안나서 다시 함..ㅠㅠ
public class Q2579 {
    static int arr[];
    static Integer dp[];

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        arr=new int[num+1];
        dp=new Integer[num+1];
        for(int i=1;i<=num;i++){
            arr[i]=sc.nextInt();
        }
        dp[0]=arr[0]=0;
        dp[1]=arr[1];
        if(num>=2)
            dp[2]=arr[1]+arr[2];
        System.out.println(find(num));
    }
    static int find(int n){
        if(dp[n]==null){
            dp[n]=Math.max(find(n-3)+arr[n-1], find(n-2))+arr[n];
        }
        return dp[n];
    }
}
