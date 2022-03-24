package D0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
    static int n;
    static int[] n_arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        n_arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            n_arr[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(n_arr);
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            System.out.println(binary(Integer.parseInt(st.nextToken())));
        }
    }
    static int binary(int target){
        int start=0;
        int end=n-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(n_arr[middle]>target)
                end=middle-1;
            else if(n_arr[middle]==target)
                return 1;
            else
                start=middle+1;
        }
        return 0;
    }
}
