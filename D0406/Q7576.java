package D0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {
    static int w, h;
    static boolean[][] visit;
    static int[][] box;
    static int[] x={1, -1, 0, 0};
    static int[] y={0, 0, -1, 1};
    static Queue<int[]> q=new LinkedList<>();
    static int max=0, count=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        h=Integer.parseInt(st.nextToken());
        w=Integer.parseInt(st.nextToken());
        visit=new boolean[w][h];
        box=new int[w][h];
        for(int i=0;i<w;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<h;j++){
                int num=Integer.parseInt(st.nextToken());
                if(num==1){
                    q.offer(new int[]{i, j});
                    visit[i][j]=true;
                }
                if(num==0){
                    count++;
                }
                box[i][j]=num;
            }
        }
        //먼저 1인거 다 담아두고
        //1주변으로 싹다 만들기
        //다시 반복
        bfs();
        if(count==0)
            System.out.println(max);
        else
            System.out.println(-1);
    }
    static void bfs(){
        while(!q.isEmpty()){
            int[] p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p[0]+x[i];
                int ny=p[1]+y[i];
                if(nx>=0&&nx<w&&ny>=0&&ny<h&&!visit[nx][ny]&&box[nx][ny]==0){
                    visit[nx][ny]=true;
                    box[nx][ny]=box[p[0]][p[1]]+1;
                    max=Math.max(box[nx][ny], max)-1;
                    --count;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
