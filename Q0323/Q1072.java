package D0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1072 {
    static long n, w;
    static int percent;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Long.parseLong(st.nextToken());
        w=Long.parseLong(st.nextToken());
        percent= (int) ((double)w*100/(double)n);
        if(percent>=99){
            System.out.println(-1);
            return;
        }
        long start=1;
        long end=Long.MAX_VALUE-1;
        while(start<end){
            long middle=(start+end)/2;
            //System.out.println("middle: "+middle+": "+(int) (((double)(w+middle)/(double)(n+middle))*100));
            if((int) (((double)(w+middle)*100/(double)(n+middle)))>=percent+1)
                end=middle;
            else
                start=middle+1;
        }
        System.out.println(start);
    }
}