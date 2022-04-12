package D0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1967 {
    static LinkedList<Point>[] graph;
    static int n;
    static boolean[] visit;
    static int max_node, max_num=Integer.MIN_VALUE;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        graph=new LinkedList[n+1];
        visit=new boolean[n+1];
        for(int i=0;i<=n;i++)
            graph[i]=new LinkedList<>();
        for(int i=0;i<n-1;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());
            graph[num1].add(new Point(num2, cost));
            graph[num2].add(new Point(num1, cost));
        }
        dfs(1, 0);
        max_num=Integer.MIN_VALUE;
        visit=new boolean[n+1];
        dfs(max_node, 0);
        System.out.println(max_num);
    }
    static void dfs(int node, int sum){
        visit[node]=true;
        for(Point p:graph[node]){
            if(!visit[p.node]){
                if(p.distance+sum>=max_num){
                    max_node=p.node;
                    max_num=p.distance+sum;
                }
                dfs(p.node, sum+p.distance);
            }
        }

    }
}
