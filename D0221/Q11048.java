package D0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11048 {
    static Integer dp[][];
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());

        dp=new Integer[x+1][y+1];
        arr=new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=y;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        //System.out.println(arr[1][1]); //입력 확인
        //arr[0] 부분 0으로 초기화
        for(int i=0;i<=y;i++)
            arr[0][i]=0;
        for(int i=0;i<=x;i++)
            arr[i][0]=0;
        //dp[1][1]==arr[1][1], 1,1에서 출발함으로
        dp[1][1]=arr[1][1];
        System.out.println(find(x, y));

    }
    static int find(int x, int y){
        //System.out.println("First enter: "+x+", "+y);
        if(x<0||y<0)
            return -1;
        else{
            if(dp[x][y]==null){
                dp[x][y]=Math.max(find(x, y-1), Math.max(find(x-1, y), find(x-1, y-1)))+arr[x][y];
            }
            //System.out.println("dp[x][y]: "+x+", "+y+", result: "+dp[x][y]);
            return dp[x][y];
        }
    }

}
