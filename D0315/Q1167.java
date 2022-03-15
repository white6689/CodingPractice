package D0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1167 {
    static ArrayList<Node>[] list;
    static boolean[] visit;
    static int max;
    static int node;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        list=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            list[i]=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            while(true){
                int m=Integer.parseInt(st.nextToken());
                if(m==-1)
                    break;
                int cost=Integer.parseInt(st.nextToken());
                list[s].add(new Node(m, cost));
            }
        }
        visit=new boolean[n+1];
        dfs(1, 0);
        visit=new boolean[n+1];
        dfs(node, 0);
        System.out.println(max);

    }
    static void dfs(int n, int sum){
        if(max<sum){
            node=n;
            max=sum;
        }
        visit[n]=true;
        for(int i=0;i<list[n].size();i++){
            if(!visit[list[n].get(i).node]){
                visit[list[n].get(i).node]=true;
                dfs(list[n].get(i).node,sum+list[n].get(i).cost );
            }
        }
    }
    public static class Node{
        int node, cost;
        public Node(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
    }
}
