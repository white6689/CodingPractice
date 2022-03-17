package D0317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9466 {
    // 텀 프로젝트
    static int[] map;
    static int[] visit;
    static boolean[] visit_chk;
    static int n, count, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            map=new int[n+1];
            visit=new int[n+1];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++)
                map[j]=Integer.parseInt(st.nextToken());
            result=0;
            for(int j=1;j<=n;j++){
                count=0;
                if(visit[j]>=1){
                    continue;
                }
                else{
                    visit_chk=new boolean[n+1];
                    dfs(j);
                    result+=count;
                }
            }
            System.out.println(n-result);
        }
    }
    static void dfs(int start){
        if(visit_chk[start]==false&&visit[start]>=1)
            return;
        visit_chk[start]=true;
        visit[start]+=1;
        if(visit[start]==3)
            return;
        else{
            if(visit[start]==2)
                count++;
            dfs(map[start]);
        }
    }
}
