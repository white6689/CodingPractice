package D0301;

import java.util.Scanner;

public class Q1676 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double sum=1;
        for(int i=0;i<num;i++)
            sum*=(i+1);
        System.out.println(sum);
    }
}
