package D0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringTokenizer st=null;
        int[] arr;
        for(int i=0;i<t;i++){
            long sum=0;
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            arr=new int[n];
            for(int j=0;j<n;j++)
                arr[j]=Integer.parseInt(st.nextToken());
            //모든 쌍의 gcd 합을 구하기
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++)
                    sum+=gcd(arr[j], arr[k]);
            }
            System.out.println(sum);
        }
    }
    static long gcd(long a, long b){
        if(a%b==0)
            return b;
        else
            return gcd(b, a%b);
    }
}
