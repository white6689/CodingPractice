package D0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17266 {
    //입력작은디 걍 해
    static int n, m;
    static int x[];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        x=new int[m];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++)
            x[i]=Integer.parseInt(st.nextToken());
        int start=0;
        int end=100000;
        while(start<=end){
            int middle=(start+end)/2;
            if(solve(middle))
                end=middle;
            else
                start=middle+1;
        }
        System.out.println(start);
    }
    static boolean solve(int h){
        int light=0;
        for(int i=0;i<m;i++)
            light+=(x[i]+h+h);
        return light>=n;
    }
}
