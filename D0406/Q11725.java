package D0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q11725 {//tree 부모 찾기, 시작 노드 중요
    static int n;
    static boolean[][] graph;
    static LinkedList<Integer>[] graph_linked;
    static boolean[] visit;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        //dfs 두번?
        graph_linked=new LinkedList[n+1];
        for(int i=0;i<=n;i++){
            graph_linked[i]=new LinkedList<>();
        }
        graph=new boolean[n+1][n+1];
        visit=new boolean[n+1];
        parent=new int[n+1];
        for(int i=0;i<n-1;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            graph_linked[num1].add(num2);
            graph_linked[num2].add(num1);
            //graph[num1][num2]=true;
            //graph[num2][num1]=true;
        }
        visit[1]=true;
        for(Integer n:graph_linked[1]){
            if(!visit[n]) {//4, 6
                parent[n]=1;
                dfs(n);
            }
        }
        for(int i=2;i<=n;i++)
            System.out.println(parent[i]);
    }
    static  void dfs(int node){//4
        visit[node]=true;//4 true
        for(Integer n:graph_linked[node]){//2 7
            if(!visit[n]) {
                parent[n]=node;
                dfs(n);
            }
        }
    }
}
