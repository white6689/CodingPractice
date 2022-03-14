package D0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
    static int[][] graph;
    static boolean[][] visit;//방문 표시
    static int n;
    static int m;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        graph=new int[n][m];
        visit=new boolean[n][m];
        for(int i=0;i<n;i++){
            String[] arr=br.readLine().split("");
            for(int j=0;j<m;j++){
                graph[i][j]=Integer.parseInt(arr[j]);
            }
        }//--초기화
        visit[0][0]=true;
        bfs(0,0);
        System.out.println(graph[n-1][m-1]);

    }
    //완전 탐색시(dfs) 시간이 많이 걸림으로 bfs 활용
    static void bfs(int i, int j){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[] {i, j});
        while(!q.isEmpty()){
            int now[]=q.poll();
            int nowX=now[0];
            int nowY=now[1];
            for(int k=0;k<4;k++){
                int nx=nowX+dx[k];
                int ny=nowY+dy[k];
                //0보다 작고 n,m 이상인 값이면 넘어가기--범위 제한
                if(nx<0||ny<0||nx>=n||ny>=m)
                    continue;
                //방문했던 곳이고, 그래프가 0이면(지나갈 수 없는 곳이면
                if(visit[nx][ny]||graph[nx][ny]==0)
                    continue;
                q.add(new int[]{nx, ny});
                graph[nx][ny]=graph[nowX][nowY]+1;
                visit[nx][ny]=true;
            }
        }

        visit[i][j]=true;

    }
}
