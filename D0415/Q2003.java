package D0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2003 {
    static int[] arr;
    static int n, cnt=0;
    static long m;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Long.parseLong(st.nextToken());
        arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            sum_chk(i);
        }
        System.out.println(cnt);
    }
    static void sum_chk(int start_idx){
        long sum=0;
        for(int i=start_idx;i<n;i++){
            sum+=arr[i];
            if(sum==m){
                ++cnt;
                return;
            }
            else if(sum>m)
                return;
        }

    }
}
