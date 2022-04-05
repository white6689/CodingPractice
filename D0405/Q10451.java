package D0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10451 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] arr=new int[n+1];
            int[] visit=new int[n+1];
            for(int j=1;j<=n;j++)
                arr[j]=Integer.parseInt(st.nextToken());
            int count=0;
            for(int j=1;j<=n;j++){
                if(visit[j]==0){
                    circle(arr, visit, j);
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
    static void circle(int[] arr, int[] visit, int n){
        visit[n]+=1;
        if(visit[n]>=2)
            return;
        circle(arr, visit, arr[n]);
    }
}
