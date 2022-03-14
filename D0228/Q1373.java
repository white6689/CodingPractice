package D0228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1373 {

    //이진수(01)를 8진수(0~7)로 바꾸기
    //0>0,1>1, 10>2, 11>3, 100>4, ... ,111>7,1000>10
    //문자열로 받기
    //1, 8, 8^2, 8package D0228;
    //
    //import java.io.BufferedReader;
    //import java.io.IOException;
    //import java.io.InputStreamReader;
    //import java.util.StringTokenizer;
    //
    //public class Q1373 {
    //
    //    //이진수(01)를 8진수(0~7)로 바꾸기
    //    //0>0,1>1, 10>2, 11>3, 100>4, ... ,111>7,1000>10
    //    //문자열로 받기
    //    //1, 8, 8^2, 8^3, ....
    //    public static void main(String[] args) throws IOException {
    //        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //        String str= br.readLine();
    //        int size=str.length();
    //        int[] result=new int[size];//넉넉하게
    //        StringTokenizer st=new StringTokenizer(br.readLine());
    //        double sum=0;
    //        int i=0;
    //        while(st.hasMoreTokens()){
    //            int n=Integer.parseInt(st.nextToken(""));
    //            sum=sum+(n*(Math.pow(2, i)));
    //        }
    //
    //        System.out.println(sum);
    //    }
    //}^3, ....
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        int size=str.length();
        int[] result=new int[size];//넉넉하게
        StringTokenizer st=new StringTokenizer(br.readLine());
        double sum=0;
        int i=0;
        while(i<size){
            int n=Integer.parseInt(st.nextToken(""));
            sum=sum+(n*(Math.pow(2, i)));

        }

        System.out.println(sum);
    }
}
