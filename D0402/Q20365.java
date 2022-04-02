package D0402;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q20365 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        String s=st.nextToken();
        int rcnt=0, bcnt=0;
        char arr[] = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            char c = arr[i];
            if(i==0) {
                if(c=='B') bcnt++;
                else rcnt++;
            }
            else {
                if(arr[i-1]==c) continue;
                else {
                    if(c=='B') bcnt++;
                    else rcnt++;
                }
            }
            int ans = 0;
            if(rcnt>=bcnt)
                ans = bcnt+1;
            else
                ans = rcnt+1;
            System.out.println(ans);
        }

    }
}
