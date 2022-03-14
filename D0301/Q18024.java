package D0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String[] str=new String[4];
        for(int i=0;i<4;i++)
            str[i]=st.nextToken();
        String a=str[0];
        a=a.concat(str[1]);

        String b=str[2];
        b=b.concat(str[3]);

        System.out.println(Long.parseLong(a)+Long.parseLong(b));
    }

}
