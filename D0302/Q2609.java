package D0302;

import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long aa=sc.nextLong();
        long bb=sc.nextLong();

        long nums=gcd(aa, bb);
        System.out.println(nums);
        System.out.println((aa/nums)*(bb/nums)*nums);
    }
    static long gcd(long a, long b){
        if(a%b==0)
            return b;
        else
            return gcd(b, a%b);
    }
}
