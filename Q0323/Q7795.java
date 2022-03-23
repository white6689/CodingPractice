package Q0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q7795 {
    static int a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            int[] a_arr=new int[a];
            int[] b_arr=new int[b+1];
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<a;j++)
                a_arr[j]=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++)
                b_arr[j]=Integer.parseInt(st.nextToken());
            b_arr[b]=Integer.MAX_VALUE;
            Arrays.sort(b_arr);

            int count=0;
            for(int j=0;j<a;j++){
                int left_index=left(b_arr, a_arr[j]);
                //System.out.println(T+"/left Index: "+left_index);
                if(left_index!=-1)
                    count+=left_index;
            }
            System.out.println(count);
        }
    }
    static int left(int[] sorted, int target){
        int start=0;
        int end=sorted.length;
        while(start<end){
            int middle=(start+end)/2;
            if(sorted[middle]>=target)
                end=middle;
            else
                start=middle+1;
        }
        if(sorted[start]==target)
            if(start-1==-1)
                return 0;
            else
                return start;
        else
            return start;
    }
}
