package D0322;

import java.io.*;
import java.util.StringTokenizer;

public class Q19637 {
    //left bound 찾기
    static long[] score;
    static String[] name;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        score=new long[n];
        name=new String[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            name[i]=st.nextToken();
            score[i]=Long.parseLong(st.nextToken());
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<m;i++){
            bw.write(upperBound(Long.parseLong(br.readLine()))+"\n");
//             System.out.println();
        }
    }
    //왼쪽 bound 찾기
    static String upperBound(long target){
        int start=0;
        int end=n-1;
        while(start<end){
            int middle=(start+end)/2;
            if(target>score[middle])
                start=middle+1;
            else{
                end=middle;
            }
        }
        return name[start];
    }
}

