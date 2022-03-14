package D0302;

import java.util.Scanner;

public class Q11005 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int b=sc.nextInt();
        int remain=0;
        int alphabet='A'-10;
        String result="";
        while(true){
            if(n/b==0){
                if((n%b)>=10){
                    System.out.println((Character.toString((int)(n%b)+alphabet))+result);
                }else
                    System.out.println((n%b)+result);
                break;
            }
            remain=(int)(n%b);
            if(remain>=10){
                result=(Character.toString(remain+alphabet))+result;
            }
            else
                result=remain+result;
            //System.out.println(result+": "+n);
            n=n/b;
        }
    }
}
