package D0312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10451 {
    static int length;
    static int[] graph;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            //초기화
            int count=0;
            length=Integer.parseInt(br.readLine());
            graph=new int[length+1];
            visit=new boolean[length+1];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=length;j++)
                graph[j]=Integer.parseInt(st.nextToken());
            //계산
            for(int j=1;j<=length;j++){
                if(!visit[j]){
                    dfs(j, graph[j]);
                    count++;
                }
            }
            System.out.println(count);
        }

    }
    static void dfs(int first, int node){
        //처음과 시작이 같아지면, 사이클 발견
        if(first==node)
            return;
        visit[node]=true;
        dfs(first, graph[node]);

    }
}
