package D0222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
    static Integer dp[][];
    static int color[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int num=Integer.parseInt(st.nextToken());
        //코드 가독성을 높이기 위해 1씩 늘려 만듦
        dp=new Integer[num+1][2];//0은 값, 1은 어떤 rgb?(index num)
        color=new int[num+1][4];
        //입력 받기
        for(int i=1;i<=num;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=3;j++)
                color[i][j]=Integer.parseInt(st.nextToken());
        }
        //1)---계산, dp의 초기값 설정해주기
        int min=100000000;
        for(int i=1;i<=3;i++){
            //System.out.println("color value: "+color[1][i]);
            if(min>=color[1][i]){
                min=color[1][i];
                dp[1][1]=i;
            }
        }
        dp[1][0]=min;
        //System.out.println(dp[1][1]+", 값: "+dp[1][0]);

        //2)---계산, dp값 구하기
        for(int i=2;i<=num;i++){
            int jump=dp[i-1][1];//뛰어넘을 rgb
            int min_num=100000000;
            for(int j=1;j<=3;j++){
                if(j==jump)//이전 rgb 겹침 방지
                    continue;
                if(min_num>=color[i][j]){
                    min_num=color[i][j];
                    dp[i][1]=j;
                }
            }
            dp[i][0]=min_num+dp[i-1][0];
            System.out.println("집 n: "+i+", color: "+dp[i][1]+", 누적 값: "+dp[i][0]);
        }


    }

}
