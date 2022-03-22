package D0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q22871 {
    static int n;
    static long[] arr;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new long[n];
        dp=new long[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(st.nextToken());
            dp[i]=-1;
        }
        System.out.println(jump(0));
    }
    //돌을 건널 수 있는 최대 k 값
    static long jump(int start){
        if(start==n-1)
            return 0;
        if(dp[start]!=-1)
            return dp[start];
        dp[start]=Long.MAX_VALUE;
        for(int i=start+1;i<n;i++)
            dp[start]=Math.min(dp[start], Math.max(jump(i), (i-start)*(1+Math.abs(arr[start]-arr[i]))));
        return dp[start];
    }
}
