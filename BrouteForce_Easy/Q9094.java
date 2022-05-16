package BrouteForce_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int count=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            for(int b=1;b<n;b++){
                for(int a=1;a<b;a++){
                    if((Math.pow(a, 2)+Math.pow(b, 2)+m)%(a*b)==0)
                        ++count;
                }
            }
            System.out.println(count);
        }


    }
}
