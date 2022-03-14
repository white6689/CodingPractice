package D0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        //a진수를 10진수로 변환
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        long dec=0;
        for(int i=0;i<m;i++){
            dec+=(Integer.parseInt(st.nextToken()))*(Math.pow(a, m-i-1));
        }
        //10진수를 b진수로 변환
        String result="";
        long remain=0;
        while(true){
            if(dec/b==0){
                System.out.println((dec%b)+result);
                break;
            }
            remain=(int)(dec%b);
            result=" "+remain+result;
            //System.out.println(result+": "+n);
            dec=dec/b;

        }
    }
}
