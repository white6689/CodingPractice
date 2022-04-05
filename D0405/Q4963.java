package D0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4963 {
    static int[][] graph;
    static boolean[][] visit;
    static int[] x={-1, 1, 0, 0, 1, -1, 1, -1};
    static int[] y={0, 0, 1, -1, 1, -1, -1, 1};
    static int w, h;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        h=Integer.parseInt(st.nextToken());
        w=Integer.parseInt(st.nextToken());
        while(w!=0&&h!=0){
            int count=0;
            graph=new int[h][w];
            visit=new boolean[h][w];
            for(int i=0;i<h;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++){
                    graph[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(!visit[i][j]&&graph[i][j]!=0){
                        visit[i][j]=true;
                        bfs(i, j);
                        ++count;
                    }
                }
            }
            System.out.println(count);
            st=new StringTokenizer(br.readLine());
            w=Integer.parseInt(st.nextToken());
            h=Integer.parseInt(st.nextToken());
        }
    }
    static void bfs(int ii, int jj){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{ii, jj});
        while(!queue.isEmpty()){
            int[] num=queue.poll();
            for(int i=0;i<8;i++){
                //그래프가 1이고 범위 밖으로 안나가 있고, 방문한적이 없으면 queue에 다시 넣는다?ㅇㅇ
                int nx=num[0]+x[i];
                int ny=num[1]+y[i];
                if(nx>=0&&nx<h&&ny>=0&&ny<w&&graph[nx][ny]==1&&!visit[nx][ny]){
                    visit[nx][ny]=true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }
}