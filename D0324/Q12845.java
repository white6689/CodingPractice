package D0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] level=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        level[0]=Integer.parseInt(st.nextToken());
        int max=level[0];
        int max_index=0;
        for(int i=1;i<n;i++){
            int data=Integer.parseInt(st.nextToken());
            if(max<data){
                max=data;
                max_index=i;
            }
            level[i]=data;
        }
        //계산
        int result=0, new_level=0;
        //인접한 것끼리 더하기
        if (max_index == 0) {
            if(n==1){
                System.out.println(max);
                return;
            }
            result = level[max_index] + level[max_index + 1];
            new_level=max;
        }




    }
}
