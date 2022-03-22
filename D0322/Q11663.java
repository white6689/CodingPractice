package D0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11663 {
    static int n,m;
    static long point[];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        point=new long[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            point[i]=Integer.parseInt(st.nextToken());
        point[n]=Long.MAX_VALUE;
        Arrays.sort(point);
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            long start=Long.parseLong(st.nextToken());
            long end=Long.parseLong(st.nextToken());
            sb.append(higher_bound(end)-lower_bound(start)).append("\n");
        }
        System.out.print(sb);
    }
    static int lower_bound(long target){
        int start=0;
        int end=point.length;
        while(start<end){
            int middle=(start+end)/2;
            if(target>point[middle])
                start=middle+1;
            else
                end=middle;
        }
        return start;
    }
    static int higher_bound(long target){
        int start=0;
        int end=point.length;
        while(start<end){
            int middle=(start+end)/2;
            if(target>=point[middle])
                start=middle+1;
            else
                end=middle;
        }
        return start;
    }
}
