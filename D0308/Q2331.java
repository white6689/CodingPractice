package D0308;

import java.util.Scanner;
import java.util.Stack;

public class Q2331 {
    static long a;
    static int p;
    static int[] visited=new int[300000];
    public static void main(String[] args){
        //단순 구현
        Scanner sc=new Scanner(System.in);
        a=sc.nextLong();
        p=sc.nextInt();
        //반복되는 부분 찾아볼 곳
//        Stack<Long> stack=new Stack<>();
//        boolean chk=true;
//        long result=0;
//        long num=0;
//        stack.push(a);
//        while(chk){
//            result=0;
//            String st=Long.toString(stack.peek());
//            for(int i=0;i<st.length();i++){
//                result+=Math.pow(st.charAt(i)-48, p);
//            }
//            //stack 하나씩 본다
//            for(long l:stack){
//                //System.out.print(l+", ");
//                if(l==result){
//                    chk=false;
//                    num=result;
//                }
//            }
//            if(chk)
//                stack.push(result);
//            else
//                a=result;
//            //System.out.println();
//        }
//        //num을 만날때까지 stack 뺀다.
//        while(true){
//            if(num==stack.peek())
//                break;
//            stack.pop();
//        }
//        System.out.println(stack.size()-1);
        System.out.println(dfs());
    }
    //반복되는 부분은 count가 2, 다시 반복되어 시작되는 부분은 count 3, 반복되지 않은 부분은 1
    static int dfs(){
        int count=0;
        long pre_num=a;
        visited[(int)a]+=1;
        long result;
        while(true){
            String str=Long.toString(pre_num);
            result=0;
            for(int i=0;i<str.length();i++)
                result+=Math.pow(str.charAt(i)-48, p);
            //System.out.print(result+", ");
            visited[(int)result]+=1;
            if(visited[(int)result]>=3)
                break;
            pre_num=result;
        }
        for(int i=0;i<visited.length;i++){
//            if(visited[i]!=0)
//                System.out.println(i+"'s count= "+visited[i]);
            if(visited[i]==1)
                count++;
        }
        return count;
    }
}
