package D0223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//모든 색을 다 봐야한다.ㅠ
public class Q1149 {
    static Integer dp[][];
    static int color[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int num=Integer.parseInt(st.nextToken());
        dp=new Integer[num][3];
        color=new int[num][3];

        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++)
                color[i][j]=Integer.parseInt(st.nextToken());
        }

        dp[0][0]=color[0][0];
        dp[0][1]=color[0][1];
        dp[0][2]=color[0][2];
        for(int i=1;i<num;i++){
            //빨간색을 선택했을 경우, 이전의 값에서 최소인 색?합?+빨강색 값
            dp[i][0]=Math.min(dp[i-1][1], dp[i-1][2])+color[i][0];
            dp[i][1]=Math.min(dp[i-1][0], dp[i-1][2])+color[i][1];
            dp[i][2]=Math.min(dp[i-1][0], dp[i-1][1])+color[i][2];
        }
        int result=Math.min(dp[num-1][0], Math.min(dp[num-1][1], dp[num-1][2]));
        System.out.println(result);



    }
}
