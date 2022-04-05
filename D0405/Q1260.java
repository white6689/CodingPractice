package D0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q1260 {
    static boolean[][] graph;
    static boolean[] visit;
    static int v, n;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] base=br.readLine().split(" ");
        v=Integer.parseInt(base[0]);
        n=Integer.parseInt(base[1]);
        int start_node=Integer.parseInt(base[2]);
        graph=new boolean[v+1][v+1];
        visit=new boolean[v+1];
        for(int i=0;i<n;i++){
            String[] line=br.readLine().split(" ");
            graph[Integer.parseInt(line[0])][Integer.parseInt(line[1])]=true;
            graph[Integer.parseInt(line[1])][Integer.parseInt(line[0])]=true;
        }
        dfs(start_node);
        System.out.println();
        visit=new boolean[v+1];
        bfs(start_node);
    }
    static void dfs(int node){
        visit[node]=true;
        System.out.print(node+" ");
        for(int i=1;i<=v;i++){
            if(!visit[i]&&(graph[node][i]||graph[i][node]))
                dfs(i);
        }
    }
    static void bfs(int node){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(node);
        visit[node]=true;
        System.out.print(node+" ");
        while(!queue.isEmpty()){
          int n=queue.poll();
          for(int i=1;i<=v;i++){
              if(!visit[i]&&(graph[n][i]||graph[i][n])){
                  visit[i]=true;
                  System.out.print(i+" ");
                  queue.offer(i);
              }
          }
        }
    }
}
