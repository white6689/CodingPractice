package D0326;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2217 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int max=arr[0]*arr.length;
        for(int i=1;i<arr.length;i++){//
            if(arr[i-1]<arr[i]){
                max=Math.max(arr[i]*(arr.length-i), max);
            }
        }
        System.out.println(max);
    }
}
