package D0312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4963 {
    static int w, h;
    static int[][] graph;
    static boolean[][] visit;
    static int[] dx={0, 0, 1, -1, 1, -1, 1, -1};
    static int[] dy={1, -1, 0, 0,1, -1, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            h=Integer.parseInt(st.nextToken());
            w=Integer.parseInt(st.nextToken());
            int count=0;
            //종료 조건
            if(w==0&&h==0)
                break;
            graph=new int[w][h];
            visit=new boolean[w][h];
            //그래프 초기화
            for(int i=0;i<w;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<h;j++)
                    graph[i][j]=Integer.parseInt(st.nextToken());
            }
            //섬의 갯수를 출력하기
            for(int i=0;i<w;i++){
                for(int j=0;j<h;j++)
                    //방문 안했고,
                    if(graph[i][j]==1&&!visit[i][j]){
                        count++;
                        dfs(i, j);
                    }
            }
            System.out.println(count);
        }
    }
    static void dfs(int i, int j){
        visit[i][j]=true;
        for(int k=0;k<8;k++){
            int nx=i+dx[k];
            int ny=j+dy[k];

            //범위 안의 데이터라면
            if(nx>=0&&ny>=0&&nx<w&&ny<h){
                if(graph[nx][ny]==1&&!visit[nx][ny])
                    dfs(nx, ny);
            }
        }
    }
}
