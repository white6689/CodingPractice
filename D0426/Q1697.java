package D0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1697 {
    static int n, k;
    static int result_count=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        n=Integer.parseInt(st.nextToken());
//        k=Integer.parseInt(st.nextToken());
//        greedy(n, 0);
//        System.out.println("result_count: "+result_count);
        int n=1;
        for(int i=0;i<100;i++){
            n=n*2;
            System.out.print(n+"_");
        }

    }
    static void greedy(int now_num, int count){
        System.out.print(now_num+"_");
        // 같으면 끝
        if(now_num==k){
            System.out.println(": "+count);
            result_count=Math.min(result_count, count);
            return;
        }
        // 초과하면 뺀 값을 count 더하고 끝
        if(now_num>k){
            result_count=Math.min(result_count, (now_num-k-1)+count);
            System.out.println(": "+(now_num-k-1)+count+"_this is now_num>k");
            return;
        }
        // 작다면...
        if(now_num<k){
            // 0이면 더하기
            if(now_num==0){
                greedy(now_num+1, count+1);
            }
            if(k-now_num<now_num*2-k){
                result_count=Math.min(result_count, (k-now_num));
                return;
            }
            else{
                greedy(now_num*2, count+1);
                greedy(now_num+1, count+1);
            }
        }

    }
}
