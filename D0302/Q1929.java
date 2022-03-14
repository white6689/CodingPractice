package D0302;

import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[] arr=new int[n+1];
        //배열 초기화
        for(int i=2;i<=n;i++)
            arr[i]=i;
        //지우기
        for(int i=2;i<=n;i++){
            if(arr[i]==0) continue;
            for(int j=2*i;j<=n;j+=i)
                arr[j]=0;
        }
        for(int i=m;i<=n;i++){
            if(arr[i]!=0)
                System.out.println(arr[i]);
        }
//        int[] arr=new int[n-m+1];
//        //1. 배열 초기화
//        for(int i=0;i<arr.length;i++)
//            arr[i]=i+m;
//        System.out.println(Arrays.toString(arr));
//        //2. 지우기
//        // 만약 0이라면(지운거라면) 건너뛰기
//        // 배수부터 지워나간다.
//        for(int i=m;i<(n-m+1);i++){
//            if(arr[i-m]==0) continue;
//            if(i==1) continue;
//            for(int j=2*i;j<(n-m+1);j+=i)
//                arr[j-m]=0;
//        }
//        // 출력, 0 또는 1이 아니면 출력
//        for(int i=m;i<(n-m+1);i++){
//            if((arr[i-m]!=0)&&(i!=1))
//                System.out.println(arr[i-m]);
//        }

    }
}
