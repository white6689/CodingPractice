package D0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182_re {
    static int cnt=0;
    static int result;
    public static void main(String[] args)throws IOException {
        //수열의 원소를 다 더한 값이 S가 되도록하자
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        result=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=n;i++){
            back(arr,visit, 0, i);
        }
        System.out.println(cnt);
    }
    static void back(int[] arr,boolean[] visit, int start, int r){
        if(r==0){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(visit[i])
                    sum+=arr[i];
            }
            if(sum==result)
                ++cnt;
        }
        for(int i=start;i<arr.length;i++){
            visit[i]=true;
            back(arr, visit, i+1, r-1);
            visit[i]=false;
        }
    }
}
