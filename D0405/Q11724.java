package D0405;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//연결 요소 구하기
public class Q11724 {
    static boolean[] visit;
    static boolean[][] graph;
    static int n, m;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        visit=new boolean[n+1];
        graph=new boolean[n+1][n+1];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int one=Integer.parseInt(st.nextToken());
            int two=Integer.parseInt(st.nextToken());
            graph[one][two]=true;
            graph[two][one]=true;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(!visit[i]){
                bfs(i);
                ++count;
            }
        }
        System.out.println(count);
    }
    static void bfs(int start_node){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(start_node);
        visit[start_node]=true;
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int i=1;i<=n;i++){
                if(!visit[i]&&(graph[node][i]||graph[i][node])){
                    queue.offer(i);
                    visit[i]=true;
                }
            }
        }
    }
}
