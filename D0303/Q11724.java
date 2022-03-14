package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11724 {
    static int n,m;
    static boolean graph[][];
    static boolean visit[];
    public static void main(String[] args) throws IOException {
        //초기화
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        graph=new boolean[n+1][n+1];
        visit=new boolean[n+1];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=true;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            //방문 안한곳이라면
            if(!(visit[i])){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    static void dfs(int start_v){
        visit[start_v]=true;
        for(int i=1;i<=n;i++){
            //간선이 존재하고 방문을 하지 않았으면
            if((graph[start_v][i]||graph[i][start_v])&&!(visit[i]))
                dfs(i);
        }
    }
}
