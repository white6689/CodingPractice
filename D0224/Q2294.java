package D0224;

import java.util.Scanner;

public class Q2294 {
    static int dp[];
    static int arr[];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        // 최종적으로 도달하려는 값
        dp=new int[k];
        // 동전의 종류들
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //dp
        for(int i=0;i<n;i++){
            int obj=i;
            for(int j=0;j<k;j++){
                obj=i-arr[j];
                if()
            }
        }
    }
}
