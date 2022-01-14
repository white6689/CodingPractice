//package D0110;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Q9465 {
//    static Integer[][] dp;
//    static boolean[][] dp_bl;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int num=Integer.parseInt(br.readLine());
//        for(int i=0;i<num;i++){
//            //입력받기
//            int element=Integer.parseInt(br.readLine());
//            dp=new Integer[4][element+2];
//            StringTokenizer st=new StringTokenizer(br.readLine());
//            for(int j=1;j<=element;j++)
//                dp[1][j]=Integer.parseInt(st.nextToken());
//            st=new StringTokenizer(br.readLine());
//            for(int j=1;j<=element;j++)
//                dp[2][j]=Integer.parseInt(st.nextToken());
//            for(int k=0;k<element+2;k++){
//                dp[0][k]=0;
//                dp[3][k]=0;
//            }
//            dp[1][0]=0;
//            dp[2][0]=0;
//            dp[1][element+1]=0;
//            dp[2][element+1]=0;//굳이요
//
//            //계산하고 출력하기
//            System.out.println(dep(element));
//        }
//    }
//    static int dep(int column, int raw){//bottom up!
//        if(/*범위 밖의 index들이라면*/)
//            return 0;
//        if()//이미 있던 게 아니라면!
//            dp[][]=Math.max(Math.max)//4개 값을 다 비교해서 더하기??
//    }
//}
