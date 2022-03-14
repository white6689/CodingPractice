package D0302;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1850 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long aa=sc.nextLong();
        long bb=sc.nextLong();
        //유클리드 방법 사용하기
        long result=gcd(aa,bb);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<result;i++)
            str.append("1");
        System.out.println(str);
    }
    static public long gcd(long a, long b){
        if(a%b==0)
            return b;
        else
           return gcd(b, a%b);
    }
}
