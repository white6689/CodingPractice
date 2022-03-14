package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {
    //stack
    public static void main(String[] args) throws IOException {
        Stack<Character> stack=new Stack<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        boolean chk=true;
        String correct="YES";
        String incorrect="NO";
        for(int i=0;i<t;i++){
            String str=br.readLine();
            stack.clear();
            chk=true;
            if(str.charAt(0)==')'){
                System.out.println(incorrect);
                continue;
            }
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(c=='(')
                    stack.push(c);
                else if(c==')'){
                 if(stack.isEmpty()){
                     chk=false;
                     break;
                 }
                 stack.pop();
                }
            }
            if(chk&&stack.isEmpty())
                System.out.println(correct);
            else
                System.out.println(incorrect);
        }



    }
}
