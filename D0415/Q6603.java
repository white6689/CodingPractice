package D0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6603 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            if(n==0)
                return;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            boolean visit[]=new boolean[n];
            backtracking(arr, 6, visit, 0);
            System.out.println();
        }

    }
    static void backtracking(int[] arr, int depth, boolean[] visit, int start_idx){
        if(depth==0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<arr.length;i++){
                if(visit[i])
                    sb.append(arr[i]+" ");
            }
            System.out.println(sb);
        }
        for(int i=start_idx;i<arr.length;i++) {
            visit[i] = true;
            backtracking(arr, depth - 1, visit, i + 1);
            visit[i] = false;
        }
    }
}
