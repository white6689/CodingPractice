package D0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//이걸 자력으로 풀다니 존나 감동이다ㅠㅠㅠㅠㅠㅠㅠ
public class Q2178 {
    static int n, m;
    static int graph[][];
    static boolean visit[][];
    static int[] x={1,-1,0,0};
    static int[] y={0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        n=Integer.parseInt(input[0]);
        m=Integer.parseInt(input[1]);
        graph=new int[n][m];
        visit=new boolean[n][m];
        for(int i=0;i<n;i++){
            String[] arr=br.readLine().split("");
            for(int j=0;j<m;j++)
                graph[i][j]=Integer.parseInt(arr[j]);
        }
        bfs();
        System.out.println(graph[n-1][m-1]-1);
    }
    //시작은 항상 0, 0, 마지막은 항상 n-1, m-1
    static void bfs(){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0, 0});
        visit[0][0]=true;
        graph[0][0]=2;
        while(!q.isEmpty()){
            int[] p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p[0]+x[i];
                int ny=p[1]+y[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m&&graph[nx][ny]!=0&&!visit[nx][ny]){
                    if(graph[nx][ny]==1)//1이면 한번도 채워넣은적이 없음으로 바로 더하기
                        graph[nx][ny]=graph[p[0]][p[1]]+1;
                    else//채워넣은 적이 있다면 채워진 값이랑, 전값+1 한값이랑 비교해서 작은값으로 채워넣는다.
                        graph[nx][ny]=Math.min(graph[p[0]][p[1]]+1, graph[nx][ny]);
                    q.offer(new int[]{nx, ny});
                    visit[nx][ny]=true;//당연히 해야함
                }
            }
        }
    }
}
