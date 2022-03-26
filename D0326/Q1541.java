package D0326;

import java.util.Scanner;
import java.util.Stack;

public class Q1541 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] input=sc.next().split("");
        Stack<Integer> num=new Stack<>();
        Stack<String> symbol=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length;i++){
            if(symbol.size()==2){
                String last=symbol.pop();
                if(symbol.peek().equals("-")&&last.equals("+")){
                    while(i<input.length&&(!input[i].equals("+")&&!input[i].equals("-"))){
                        sb.append(input[i++]);
                    }
                    num.push(num.pop()+Integer.parseInt(sb.toString()));
                    sb=new StringBuilder();
                    if(i<input.length)
                        symbol.push(input[i]);
                    continue;
                }
                else{
                    if(symbol.peek().equals("+")){
                        num.push(num.pop()+num.pop());
                    }
                    else{
                        int second=num.pop();
                        int one=num.pop();
                        num.push(one-second);
                    }
                    symbol.pop();
                    symbol.push(last);
                    i=i-1;
                    continue;
                }
            }
            else if(input[i].equals("+")||input[i].equals("-")){
                num.push(Integer.parseInt(sb.toString()));
                symbol.push(input[i]);
                sb=new StringBuilder();
            }
            else{
                sb.append(input[i]);
            }
        }
        if(sb.length()==0){
            if(symbol.peek().equals("+"))
                System.out.println(num.pop()+num.pop());
            else{
                int nums=num.pop();
                System.out.println(num.peek()-nums);
            }
        }
        else{
            if(!symbol.isEmpty()){
                if(symbol.peek().equals("+")){
                    System.out.println(num.peek()+Integer.parseInt(sb.toString()));
                }
                else
                    System.out.println(num.peek()-Integer.parseInt(sb.toString()));

            }
            else
                System.out.println(sb);

        }
    }

}
