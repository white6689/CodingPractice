import java.util.Scanner;

public class Q1912 {

    //합이 가장 큰 값을 출력한다.
    public static Integer[] dp;
    public static int[] input;
    static int max;

    public static void main(String[] args) {
        //값 입력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        dp = new Integer[num];
        input=new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        dp[0] = max = input[0];
        System.out.println(funs(num-1));
    }

    static int funs(int N) {
        //메모이제이션
        if (dp[N] == null) {//새로운 값을 추가해야한다.
            //큰값을 추가해야한다. 선택할 수 있는 값은 연속된 값
            dp[N] = Math.max(funs(N - 1), dp[N - 1] + input[N]);
            max=Math.max(max, dp[N]);
        }
        return dp[N];
    }
}
