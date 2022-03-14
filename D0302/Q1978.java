package D0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int count=0;
        for(int i=0;i<num;i++){
            int res=Integer.parseInt(st.nextToken());
            if(res==1)
                continue;
            int j=2;
            int chk=0;
            for(;j<=Math.sqrt(res);j++){
                if(res%j==0){
                    chk=1;
                    break;
                }
            }
            if(chk==0)
                ++count;
        }
        System.out.println(count);
    }
}
