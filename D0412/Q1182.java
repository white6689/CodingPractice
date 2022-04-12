package D0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {
    static int n, result;
    static int[] arr;
    static int cnt=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        result=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        func(0, 0);
        if(result==0) cnt--;
        System.out.println(cnt);
    }
    static void func(int cur, int tot){
        if(cur==n){
            if(tot==result)
                cnt++;
            return;
        }
        func(cur+1, tot);
        func(cur+1, tot+arr[cur]);
    }
}
