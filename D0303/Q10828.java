package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {
    //속도 느리면 한번에 입력받아 배열?스택?에 저장한 뒤, 구현해보기
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String command=st.nextToken();
            //System.out.println(command);
            if(command.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));
            else if(command.equals("top")){
                if(stack.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(stack.peek());
            }//ㅋㅋ 설마 직접 구현해야하는 건 아니겠지 ㅎㅎ
            else if(command.equals("pop")){
                if(stack.isEmpty())
                    System.out.println("-1");
                else{
                    System.out.println(stack.peek());
                    stack.pop();
                }
            }
            else if(command.equals("size"))
                System.out.println(stack.size());
            else if(command.equals("empty")){
                if(stack.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            }


        }



    }
}
