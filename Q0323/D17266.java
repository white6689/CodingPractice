package Q0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D17266 {
    static int n, m;
    static int[] point;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        //light=new boolean[n+1];
        point=new int[m];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int x=Integer.parseInt(st.nextToken());
            point[i]=x;
        }
        int start=0;
        int end=n;
        while(start<end){
            int middle=(start+end)/2;
            if(light_road(middle)){
                end=middle;
            }
            else
                start=middle+1;
        }
        System.out.println(start);

    }
    static boolean light_road(int h){
        if(point[0]-h>0){
            return false;
        }
        for(int i=0;i<m-1;i++){
            //하나씩 해줘야 할일 -- 좌우로 빛 비추기
            if(point[i]+h<point[i+1]-h)
                return false;
            if(point[i]+h>=n)
                return true;
        }
        if(point[m-1]+h>=n)
            return true;
        else return false;
    }
}
