package D0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9466 {
    static int[] visit;
    static int[] graph;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            graph=new int[n+1];
            visit=new int[n+1];
            count=n;
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++)
                graph[j]=Integer.parseInt(st.nextToken());
            for(int j=1;j<=n;j++){
                if(visit[j]!=-1)
                    dfs(j);
            }
            System.out.println(count);
        }
    }
    static void dfs(int node){
        if(visit[node]==-1)
            return;
        if(visit[node]==2){
            --count;
            visit[node]=-1;
        }
        else ++visit[node];
        dfs(graph[node]);
        visit[node]=-1;
    }
}
