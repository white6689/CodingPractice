package D0303;

import java.util.*;
import java.io.*;

public class Q11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int i, j;

        //연결 정보
        ArrayList<Integer>[] list=new ArrayList[n+1];
        //초기화
        for(i=0;i<=n;i++)
            list[i]=new ArrayList<Integer>();
        //연결
        for(i=0;i<n-1;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);

        }
        //output
        int[] parents=new int[n+1];
        dfs(list, parents, n, 1, 0);
        for(j=2;j<=n;j++) System.out.println(parents[j]);

    }
    private static void dfs(ArrayList<Integer>[] list, int[] parents, int n, int start, int parent){
        parents[start]=parent;
        for(int item:list[start]){
            if(item!=parent) dfs(list, parents, n, item, start);
        }

    }
}
