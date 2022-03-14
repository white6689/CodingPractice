package D0301;

import java.util.Scanner;

public class Q1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //3 배수로 길이 맞추기, 앞에 붙여야 함
        while(str.length()%3!=0)
            str="0"+str;
        //3씩 끊어서 저장
        for(int i=0;i<str.length();i+=3){
            int num=(str.charAt(i)-48)*4+(str.charAt(i+1)-48)*2+(str.charAt(i+2)-48)*1;
            System.out.print(num);
        }


    }
}
