package D0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//dfs+dp 였다.....
public class Q1890 {
    static long dp[][];
    static int map[][];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        map=new int[N+1][N+1];
        dp=new long[N+1][N+1];
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++)
                map[i][j]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++)
                dp[i][j]=-1;
        }
    }
    public static long dfs(int x, int y){
        if(dp[x][y]!=-1)//값이 채워져 있는, 이미 경로 수가 적혀져 있다면
            return dp[x][y];
        if(x==N && y==N)//종착점에 도달한다면 1을 반환한다(경로수 +1)
            return 1;
        dp[x][y]=0;
        //현재 자리에서 ??(map 에 저장된)칸 만큼 이동
        int dx=x+map[x][y];
        int dy=y+map[x][y];

        //오른쪽, 아래 둘다 이동 불가능하다면
        if(dx>N&&dy>N)
            return 0;
        //아래로 내려갈 수 있다면
        if(dx<=N)
            dp[x][y]=Math.max(dp[x][y], dp[x][y]+dfs(dx, y));
        if(dy<=N)
            dp[x][y]=Math.max(dp[x][y], dp[x][y]+dfs(x, dy));
        return dp[x][y];

    }
}
