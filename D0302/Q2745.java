package D0302;

import java.util.Scanner;

public class Q2745 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int b=sc.nextInt();
        long num=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(('A'<=c)&&(c<='Z')){
                num+=(Math.pow(b,n.length()-i-1)*(c-55));
            }else{
                //System.out.println(c);
                num+=(Math.pow(b,n.length()-i-1)*(c-48));
            }
        }
        System.out.println(num);
    }
}
