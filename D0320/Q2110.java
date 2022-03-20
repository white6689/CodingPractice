package D0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2110 {
    static int input[];
    static int k, n;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        k=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        input=new int[k];
        for(int i=0;i<k;i++)
            input[i]=Integer.parseInt(br.readLine());
        long start=0;
        long end=1000000000;
        while(start<end){
            long mid=(start+end+1)/2;
            if(solve(mid))
                start=mid;
            else
                end=mid-1;
        }
        System.out.println(start);

    }
    static boolean solve(long ll){
        int count=0;
        for(int i=0;i<k;i++)
            count+=(input[i]/ll);
        return count>=n;
    }
}
