package D0417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10819 {
    static int[] arr;
    static int n, result=Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        backTracking(0);
        System.out.println(result);
    }
    static void backTracking(int depth){
        if(depth==n){
            int sum=0;
            for(int i=1;i<n;i++){
                sum+=Math.abs(arr[i-1]-arr[i]);
            }
            result=Math.max(sum, result);
            return;
        }
        for(int i=depth;i<n;++i){
            swap(depth, i);
            backTracking(depth+1);
            swap(depth, i);
        }
    }
    static void swap(int depth, int target){
        int temp=arr[depth];
        arr[depth]=arr[target];
        arr[target]=temp;
    }
}

