package D0219;


import java.util.Scanner;

// 설탕배달
public class Q2839 {
    static Integer[] dp;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp=new Integer[num+1];
        dp[0]=-1;
        dp[1]=-1;
        if(num>=2){
            dp[2]=-1;
        }

    }
    static int delivery(int num){
        if(num==0)
            return 0;
        else if(dp[num]==null){
            if(num<0)
                dp[num]=-1;
            else{
                int five=delivery(num-5);
                int third=delivery(num-3);
                if(five!=-1&&third!=-1){//둘다 -1이 아니라면 비교해서 넣기
                    dp[num]=Math.min(five, third)+1;
                }
                else if(third==-1){
                    dp[num]=five+1;
                }
                else if(five==-1){
                    dp[num]=third+1;
                }
            }
        }
        return dp[num];
    }
}
