package D0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q9466 {
    static int[] graph;
    static int[] visit_num;
    static int n;
    static int count;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            count=n;
            graph=new int[n+1];
            visit_num=new int[n+1];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++)
                graph[j]=Integer.parseInt(st.nextToken());
            dfs(1);
            for(int j=1;j<=n;j++){
                if(visit_num[j]!=-1)
                    dfs(j);
            }
            System.out.println(count);
        }
    }
    static void dfs(int node){
        ++visit_num[node];
        if(visit_num[node]==2){
            --count;
            visit_num[node]=-1;
            return;
        }
        if(visit_num[graph[node]]!=-1)
            dfs(graph[node]);
        visit_num[node]=-1;

    }
}
