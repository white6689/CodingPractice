package D0308;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2667 {
    static int graph[][];
    static int n;
    static int index[]=new int[25*25];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        graph=new int[n][n];
        for(int i=0;i<n;i++){
            String st=br.readLine();
            for(int j=0;j<n;j++)
                graph[i][j]=st.charAt(j)-48;
        }
        dfs(0, 0, 0);
//        Arrays.sort(index);
//        int count=0;
//        for(int i=0;i<index.length;i++){
//            if(index[i]>=1){
//                ++count;
//                System.out.println(index[i]);
//            }
//        }
//        System.out.println(count);

    }
    static void dfs(int i, int j, int current){
        //범위 밖으로 넘어가면 return
        if(i>n||i<0||j>n||j<0){
            //System.out.println("fail: "+i+", "+j);
            return;
        }
        Thread thread=new Thread();
        //방문 했던곳 방문 X
        if(graph[i][j]==2)
            return;
        //값이 0이면 current 증가시키고 다음으로 진행
        if(graph[i][j]==0){
            //좌우, 왜 안넘아가지?
            int ii=i;
            int jj=j;
            dfs(ii-1, jj,current+1);
            dfs(ii+1, jj, current+1);
            System.out.println("Hell: ");
            dfs(ii, jj-1, current+1);
            dfs(ii, jj+1, current+1);
        }
        else if(graph[i][j]==1){
            System.out.println("success: "+i+", "+j);
            int ii=i;
            int jj=j;
            index[current]+=1;
            graph[i][j]=2;
            dfs(ii-1, j,current);
            dfs(ii+1, j, current);
            dfs(i, jj-1, current);
            dfs(i, jj+1, current);
        }
        //와 이렇게 해도 되나?ㅋㅋㅋㅋㅋㅋㅋㅋ
        //값이 1이면 index[current] 증가시키고 다음으로 진행

    }
}
