package D0301;

import java.util.Scanner;

public class Q11655 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] chr=new char[str.length()];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            //대문자
            if((65<=c)&&(c<=90))
                chr[i]=(char)(((c-65+13)%26)+65);
            //소문자
            else if((97<=c)&&(c<=122))
                chr[i]=(char)(((c-97+13)%26)+97);
            else
                chr[i]=c;
        }
        for(int i=0;i<str.length();i++)
            System.out.print(chr[i]);
    }
}
