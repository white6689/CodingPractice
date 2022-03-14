package D0303;

import java.util.Scanner;
import java.util.Stack;

public class Q10799 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Character> stack=new Stack<Character>();
        String str=sc.next();
        int[] arr=new int[3];
        int sum=0;
        int chk=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){
                stack.push('(');
                chk=1;
            }else if(c==')'){
                chk-=1;
                stack.pop();
                if(chk==0){
                    sum+=stack.size();
                }else{
                    sum+=1;
                }

            }
        }
        System.out.println(sum);
    }
}
