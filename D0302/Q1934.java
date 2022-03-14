package D0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        int a, b, result=0;
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            result=gcd(a, b);
            System.out.println((a/result)*(b/result)*(result));
        }
    }
    static int gcd(int a, int b){
        if(a%b==0)
            return b;
        else
            return gcd(b, a%b);
    }
}
