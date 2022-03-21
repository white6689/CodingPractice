package D0321;

import java.util.Scanner;

public class Q1789 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextLong();
        for(long i=1;i<4294967295L;i++){
            System.out.println(i+": "+count(i));
        }
    }
    static long count(long n){
        long counts=0;
        long i=1;
        while(true){
            n=n-i;
            //System.out.print("i: "+i+", n: "+n+"/ ");
            if(n==i||n==0||i>n)
                break;
            counts++;
            i++;
        }
        return counts+1;
    }
}
