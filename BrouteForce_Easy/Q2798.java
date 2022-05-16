package BrouteForce_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 {
    static int[] arr;
    static int n, m;
    static int result=Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        boolean[] visit=new boolean[n];
        backtracking(visit, 0, 3);
        System.out.println(result);
    }
    static void backtracking(boolean[] visit, int start,int r){
        if(r==0){
            chk(visit);
            return;
        }
        for(int i=start;i<n;i++){
            visit[i]=true;
            backtracking(visit, i+1, r-1);
            visit[i]=false;
        }
    }
    static void chk(boolean[] visit){
        int sum=0;
        for(int i=0;i<n;i++){
            if(visit[i]){
                sum+=arr[i];
              //  System.out.print(arr[i]+" ");
            }
        }
        if(sum<=m){
            result=Math.max(result, sum);
        }
    }
}
