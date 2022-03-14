package D0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7576 {
    static int map[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int n, m;
    static Stack<int[]> stack=new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=new StringTokenizer(br.readLine());
        m=1000;
        n=1000;
//        m=Integer.parseInt(st.nextToken());
//        n=Integer.parseInt(st.nextToken());
        map=new int[n][m];
        for(int i=0;i<n-200;i++)
            for(int j=0;j<m;j++)
                map[i][j]=1;

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==1)
                {
                    stack.push(new int[]{i, j});
                    count++;
                }
                else if(map[i][j]==-1)
                {
                    count++;
                }
            }
        }
        System.out.println(0);

//        for(int i=0;i<n;i++){
//            st=new StringTokenizer(br.readLine());
//            for(int j=0;j<m;j++){
//                map[i][j]=Integer.parseInt(st.nextToken(""));
//                if(map[i][j]==1)
//                {
//                    stack.push(new int[]{i, j});
//                    count++;
//                }
//                if(map[i][j]==-1)
//                {
//                    count++;
//                }
//            }
//        }
        if(count==n*m){
            System.out.println(0);
            return;
        }
        for(int[] pos:stack){
            visit=new boolean[n][m];
            map[pos[0]][pos[1]]=1;
            bfs(pos[0], pos[1]);
        }
        for(int i=0;i<n;i++){
            for(int k: map[i])
                System.out.print(k+" ");
            System.out.println();
        }
        //만약 안익은 토미토 0 이 있으면 -1 출력
        for(int i=0;i<n;i++){
            for(int k:map[i]){
                if(k==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        //그래프에서 가장 큰 얘를 출력
        int result=0;
        for(int i=0;i<n;i++){
            Arrays.sort(map[i]);
            result=Math.max(result, map[i][m-1]);
        }
        //만약 원래부터 다 익어있다면 0 출력
        if(result==1)
            System.out.println(0);
        else
            System.out.println(result-1);
    }
    static void bfs(int x, int y){
        visit[x][y]=true;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{x, y});
        while(!q.isEmpty()){
            int[] nowPos=q.poll();
            for(int i=0;i<4;i++){
                int nx=nowPos[0]+dx[i];
                int ny=nowPos[1]+dy[i];
                if(nx<0||ny<0||nx>=n||ny>=m)
                    continue;
                if(visit[nx][ny]||map[nx][ny]==-1)
                    continue;
                if(map[nx][ny]>0&&map[nx][ny]<=map[nowPos[0]][nowPos[1]]+1)
                    continue;
                if(map[nx][ny]==1)
                    map[nx][ny]=map[nowPos[0]][nowPos[1]];
                else
                    map[nx][ny]=map[nowPos[0]][nowPos[1]]+1;
                q.add(new int[]{nx, ny});
                visit[nx][ny]=true;
            }
        }

    }
}
