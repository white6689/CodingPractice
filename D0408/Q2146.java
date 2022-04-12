package D0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2146 {
    static int[][] graph;
    static int[][] visit;
    static int[] min_value;
    static int num_value;
    static int[] x={1,-1,0, 0};
    static int[] y={0,0,-1,1};
    static int n;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        graph=new int[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                graph[i][j]=Integer.parseInt(st.nextToken());
        }
        //1. 섬마다 번호를 붙인다. 번호는 2부터 시작
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]==1){
                    mark_graph(i, j);
                    ++num_value;
                }
            }
        }
//        //check
//        for(int i=0;i<n;i++){
//            for(int k:graph[i])
//                System.out.print(k+" ");
//            System.out.println();
//        }
        //1-1. 섬의 갯수를 통해 bridge 최소 거리를 저장할 배열을 생성한다.
        min_value=new int[num_value+1];
        for(int i=0;i<num_value;i++)
            min_value[i]=Integer.MAX_VALUE;

        //2. 다리 찾기
        //2-1. 다른 대륙을 만난다. count, min_count 비교후 최솟값을 저장
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]!=0){
                    visit=new int[n][n];
                    find_bridge(i, j, graph[i][j]);
                }
            }
        }
        //3. 최솟값 찾는 도중 hmm,,,,
        int result=Integer.MAX_VALUE;
        for(int i=0;i< min_value.length;i++){
            if(result>=min_value[i]&&min_value[i]!=0)
                result=min_value[i];
        }
        System.out.println(result);

    }
    static void mark_graph(int sx, int sy){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sx, sy});
        graph[sx][sy]=num_value+2;
        while(!q.isEmpty()){
            int[] p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p[0]+x[i];
                int ny=p[1]+y[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<n&&graph[nx][ny]==1){
                    graph[nx][ny] = num_value + 2;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
    static void find_bridge(int sx, int sy, int island_num){
       // System.out.println("=========="+island_num+"==========");
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sx, sy});
        while(!q.isEmpty()){
            int[] p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p[0]+x[i];
                int ny=p[1]+y[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<n&&graph[nx][ny]!=island_num){
                    // 바다이면? - 값 채운건 visit 에다가 저장
                    if(graph[nx][ny]==0){
                        if(visit[nx][ny]==0){
                            visit[nx][ny]=visit[p[0]][p[1]]+1;
                            q.offer(new int[]{nx, ny});
                        }
                        else{// 값이 채워져 있다면?
                            visit[nx][ny]=Math.min(visit[nx][ny],visit[p[0]][p[1]]+1);
                        }
                    }
                    else{// 다른 섬이면?
                        min_value[island_num-2]=Math.min(visit[p[0]][p[1]],min_value[island_num-2]);
                    }
                }
            }
        }
//        if(island_num==2){
//            for(int i=0;i<n;i++){
//                for(int k:visit[i])
//                    System.out.print(k+" ");
//                System.out.println();
//            }
//        }

    }

}
//아니 이게 맞네,,,,?....???????ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ