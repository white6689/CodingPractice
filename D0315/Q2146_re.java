package D0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//numbering, find using bfs
public class Q2146_re {
    static int[][] map;
    static boolean[][] visit;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,-1,1};
    static int n, no=0;
    static int result=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        map=new int[n][n];
        visit=new boolean[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                map[i][j]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]!=0&&!visit[i][j]){
                    no++;
                    color(i, j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]>0){//섬이라면
                    visit=new boolean[n][n];
                    bfs(i, j);
                }
            }
        }
        System.out.println(result);
    }
    static void bfs(int x, int y){
        Queue<Point> q=new LinkedList<>();
        q.offer(new Point(x, y, 0));
        int currentLand=map[x][y];
        visit[x][y]=true;
        while(!q.isEmpty()){
            Point p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p.x+dx[i];
                int ny=p.y+dy[i];
                //currentLand 과 다르다면
                if(nx>=0&&ny>=0&&nx<n&&ny<n&&!visit[nx][ny]&&map[nx][ny]!=currentLand){
                    visit[nx][ny]=true;
                    //바다라면
                    if(map[nx][ny]==0)
                        q.offer(new Point(nx, ny,p.cnt+1));
                    //다른 섬이라면
                    else
                        result=Math.min(result, p.cnt);
                }
            }
        }
    }
    static void color(int x, int y){
        Queue<Point> q=new LinkedList<>();
        q.offer(new Point(x, y, 0));
        map[x][y]=no;
        visit[x][y]=true;
        while(!q.isEmpty()){
            Point p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p.x+dx[i];
                int ny=p.y+dy[i];
                if(nx>=0&&ny>=0&&nx<n&&ny<n&&!visit[nx][ny]&&map[nx][ny]!=0){
                    visit[nx][ny]=true;
                    map[nx][ny]=no;
                    q.offer(new Point(nx, ny, 0));
                }
            }
        }
    }
    static class Point{
        int x, y, cnt;
        public Point(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
}
