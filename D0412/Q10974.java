package D0412;

import java.util.Scanner;

public class Q10974 {
    static int n;
    static int[] arr;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=1;i<=n;i++)
            arr[i-1]=i;
        permutation(arr, 0, n);
        System.out.println("==");
        //매개변수에 새로운 객체를 생성하는게 더 시간이 오래 걸림(왜지...?)
        dfs(arr, new int[n], new boolean[n], 0, n, n);
    }
    //n개 중에 r개를 선택하는 방법
    static void permutation(int[] arr, int depth, int n){
        if(depth==n){
            for(int i:arr)
                System.out.print(i+" ");
            System.out.println();
        }
        for(int i=depth;i<n;i++){
            swap(arr, depth, i);
            permutation(arr, depth+1, n);
            swap(arr, depth, i);
        }
    }
    static void swap(int[] arr, int n, int k){
        int temp=arr[n];
        arr[n]=arr[k];
        arr[k]=temp;
    }
    static void dfs(int[] arr,int[] output, boolean[] visit,int depth, int n, int r){
        if(depth==r){
            for(int k:output)
                System.out.print(k+" ");
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
            //방분한 곳이 아니라면
            if(!visit[i]){
                visit[i]=true;
                output[depth]=arr[i];
                dfs(arr, output, visit, depth+1, n, r);
                visit[i]=false;
            }
        }
    }
}
