package D0301;

import java.util.Arrays;
import java.util.Scanner;

public class Q11656 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] new_str=new String[str.length()];

        for(int i=0;i<str.length();i++)
            new_str[i]="";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++)
                new_str[i]=new_str[i].concat(String.valueOf(str.charAt(j)));
        }
        Arrays.sort(new_str, String::compareTo);
        for(int i=0;i<new_str.length;i++)
            System.out.println(new_str[i]);

    }
}
