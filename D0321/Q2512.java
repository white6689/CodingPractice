package D0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2512 {
    static int[] arr;
    static int n;
    static long all;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        all=Long.parseLong(br.readLine());
        Arrays.sort(arr);
        long start=0;
        long end=arr[n-1];
        long result=Long.MIN_VALUE;
        while(start<=end){
            //왜 1을 더하는거지?
            long mid=(start+end+1)/2;
            if(solve(mid)==0) {
                result=mid;
                break;
            }
            else if(solve(mid)==1){
                result=Math.max(result, mid);
                start=mid+1;
            }
            else
                end=mid-1;
        }
        System.out.println(result);
    }
    static int solve(long ll){
        long sum=0;
        for(int i=0;i<n;i++){
            //배정금액이 더 크다면 바로 추가
            if(arr[i]<ll)
                sum+=arr[i];
            //베정금액보다 더 큰 금액이면, 배정금액만 가능
            else
                sum+=ll;
        }
        if(all==sum)
            return 0;
        //모두 더한 값이 총 예산보다 작다면 저장, 근데 Max 저장
        else if(all>sum)
            return 1;
        //총 예산보다 크다면 upper가 더 작은 쪽을 봐야함
        else return -1;
    }
}
