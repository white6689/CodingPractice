package D0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1167 {
    static int n;
    static int[][] graph;
    static LinkedList<Point>[] graph_linkedList;
    static boolean[] visit;
    static int max_node, max_num=Integer.MIN_VALUE, sum=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        //graph=new int[n+1][n+1];
        visit=new boolean[n+1];
        graph_linkedList=new LinkedList[n+1];
        for(int i=0;i<=n;i++)
            graph_linkedList[i]=new LinkedList<>();
        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int node=Integer.parseInt(st.nextToken());
            while(node!=-1){
                int d=Integer.parseInt(st.nextToken());
                graph_linkedList[n].add(new Point(node, d));
                //graph[n][node]=Integer.parseInt(st.nextToken());
                node=Integer.parseInt(st.nextToken());
            }
        }
        dfs(1, 0);
        visit=new boolean[n+1];
        max_num=Integer.MIN_VALUE;
        dfs(max_node, 0);
        System.out.println(max_num);
    }
    //이런...방식?
    static void dfs(int node, int sum){
        visit[node]=true;
        for(Point p:graph_linkedList[node]){
            if(!visit[p.node]){
                if(sum+p.distance>=max_num){
                    max_node=p.node;
                    max_num=sum+p.distance;
                }
                dfs(p.node, sum+p.distance);
            }
        }
//        for(int i=1;i<=n;i++){
//            if(!visit[i]&&graph[node][i]>0){
//                if(sum+graph[node][i]>=max_num){
//                    max_node=i;
//                    max_num=sum+graph[node][i];
//                }
//                dfs(i, sum+graph[node][i]);
//            }
//        }
    }
}
class Point{
    int node;
    int distance;
    public Point(int n, int d){
        this.node=n;
        this.distance=d;
    }
}