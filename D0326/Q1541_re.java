package D0326;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split("-");
        //str[0]은 먼저 계산을 해준다.
        int result=0;
        String[] sub=str[0].split("\\+");
        for(int i=0;i<sub.length;i++){
            result+=Integer.parseInt(sub[i]);
        }
        for(int i=1;i<str.length;i++){
            String[] subs=str[i].split("\\+");
            int sub_num=0;
            for(int j=0;j<subs.length;j++){
                sub_num+=Integer.parseInt(subs[j]);
            }
            result=result-sub_num;
        }
        System.out.println(result);

    }
}
