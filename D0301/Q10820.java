package D0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10820 {
    //문자열 확인
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        int[] count=new int[4];//소문자, 대문자, 숫자, 공백문자
        while((str=br.readLine())!=null){
            for(int i=0;i<str.length();i++){
                int ch=str.charAt(i);
                //공백 문자
                if(((9<=ch)&&(ch<=13))||(ch==32))
                    count[3]+=1;
                //숫자
                else if((48<=ch)&&(ch<=57))
                    count[2]+=1;
                //소문자
                else if((97<=ch)&&(ch<=122))
                    count[0]+=1;
                else if((65<=ch)&&(ch<=90))
                    count[1]+=1;
            }
            System.out.println(count[0]+" "+count[1]+" "+count[2]+" "+count[3]);
            count=new int[4];
        }
    }
}
