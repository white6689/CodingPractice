package D0312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2667 {
    static int dx[]={0,0,1,-1};
    static int dy[]={1, -1, 0, 0};
    private static int graph[][];
    private static boolean visited[][];
    private static int n;
    private static int[] apart=new int[25*25];
    private static int apartNum=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        graph=new int[n][n];
        visited=new boolean[n][n];
        for(int i=0;i<n;i++){
            String st=br.readLine();
            String[] str_arr=st.split("");
            for(int j=0;j<n;j++)
                graph[i][j]=Integer.parseInt(str_arr[j]);
        }//이게 되네ㅋ

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]==1&&!visited[i][j]){
                    apartNum++;
                    dfs(i, j);
                }
            }
        }
        Arrays.sort(apart);
        System.out.println(apartNum);
        for(int i=0;i<apart.length;i++){
            if(apart[i]!=0)
                System.out.println(apart[i]);
        }
    }
    static void dfs(int i, int j){
        //방문했으니 true
        visited[i][j]=true;
        apart[apartNum]++;
        for(int k=0;k<4;k++){
            int nx=i+dx[k];
            int ny=j+dy[k];

            if(nx>=0&&ny>=0 && nx<n&&ny<n){
                if(graph[nx][ny]==1&&!visited[nx][ny])
                    dfs(nx, ny);
            }
        }

    }
}
