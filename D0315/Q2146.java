package D0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2146 {
    //섬을 구분하기위해, 번호를 붙여준다.
    //나중에 최단거리를 구할때 visit==true 인 곳을 거르면 된다.
    static int[][] map;
    static boolean[][] visit;
    static int[][] count;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int n;
    static int no=2;
    static int answer=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        map=new int[n][n];
        visit=new boolean[n][n];
        count=new int[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                map[i][j]=Integer.parseInt(st.nextToken());
        }
        //섬 번호 붙이기
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j]&&map[i][j]==1){
                    map[i][j]=no;
//                    count[i][j]=no;
                    color(i, j);
                    no++;
                }
            }
        }
        //짧은 얘 찾기
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]>=2){
                    visit=new boolean[n][n];
                    search(i, j);
                }
            }
        }

        System.out.println(answer);
    }
    static void search(int x, int y){
        Queue<Point> q= new LinkedList<>();
        q.offer(new Point(x, y, 0));
        visit[x][y]=true;
        int landNum=map[x][y];
        while(!q.isEmpty()){
            Point cp=q.poll();
            for(int i=0;i<4;i++){
                int nx=cp.r+dx[i];
                int ny=cp.c+dy[i];
                //범위안에 있고, !visit, 1이면
                if(nx>=0&&ny>=0&&nx<n&&ny<n&&!visit[nx][ny]&&map[nx][ny]!=landNum){
                    visit[nx][ny]=true;
                    if(map[nx][ny]==0){
                        q.offer(new Point(nx, ny, cp.cnt+1));
                    }else//다른 섬이면
                        answer=Math.min(answer,cp.cnt);
                }
            }

        }
    }
    static void color(int x, int y){
        Queue<int[]> q= new LinkedList<>();
        q.offer(new int[]{x, y});
        visit[x][y]=true;
        while(!q.isEmpty()){
            int[] cp=q.poll();
            for(int i=0;i<4;i++){
                int nx=cp[0]+dx[i];
                int ny=cp[1]+dy[i];
                //범위안에 있고, !visit, 1이면
                if(nx>=0&&ny>=0&&nx<n&&ny<n&&!visit[nx][ny]&&map[nx][ny]==1){
                    visit[nx][ny]=true;
                    count[nx][ny]=no;
                    map[nx][ny]=no;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
    static class Point{
        int r, c, cnt;
        public Point(int r, int c, int cnt){
            this.r=r;
            this.c=c;
            this.cnt=cnt;
        }
    }
}

