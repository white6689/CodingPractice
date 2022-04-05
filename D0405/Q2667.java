package D0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2667 {
    static int[][] graph;
    static boolean[][] visit;
    static int[] house=new int[25*25+3];
    static int[] x={1,-1,0,0};
    static int[] y={0,0,-1, 1};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        graph=new int[n][n];
        visit=new boolean[n][n];
        for(int i=0;i<n;i++){
            String[] st=br.readLine().split("");
            for(int j=0;j<n;j++){
                graph[i][j]=Integer.parseInt(st[j]);
            }
        }
        int index=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]==1&&!visit[i][j]){
                    bfs(i, j, index);
                    ++index;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        Arrays.sort(house);
        int count=0;
        for(int i=0;i<house.length;i++){
            if(house[i]!=0) {
                sb.append(house[i]).append("\n");
                ++count;
            }
        }
        System.out.println(count);
        System.out.print(sb);
    }
    static void bfs(int i, int j, int index){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i, j});
        visit[i][j]=true;
        graph[i][j]=index;
        ++house[index];
        while(!q.isEmpty()){
            int[] m=q.poll();
            for(int k=0;k<4;k++){
                int nx=m[0]+x[k];
                int ny=m[1]+y[k];
                if(nx>=0&&nx<n&&ny>=0&&ny<n&&!visit[nx][ny]&&graph[nx][ny]!=0){
                    q.offer(new int[]{nx, ny});
                    visit[nx][ny]=true;
                    ++house[index];
                }
            }
        }
    }
}
