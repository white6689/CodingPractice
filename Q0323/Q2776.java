package D0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2776 {
    static int n, m;
    static int[] n_arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringBuilder sb=new StringBuilder();
            n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            n_arr=new int[n];
            for(int j=0;j<n;j++)
                n_arr[j]=Integer.parseInt(st.nextToken());
            Arrays.sort(n_arr);
            m=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                sb.append(binary(Integer.parseInt(st.nextToken()))).append("\n");
            }
            System.out.print(sb);
        }
    }
    static int binary(int target){
        int start=0;
        int end=n-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(n_arr[middle]==target)
                return 1;
            else if(n_arr[middle]>target)
                end=middle-1;
            else
                start=middle+1;
        }
        return 0;
    }
}
