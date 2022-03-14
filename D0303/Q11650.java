package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Point[] arr=new Point[n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr[i]=new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(arr);
        for(Point p:arr)
            System.out.println(p);

    }
}
class Point implements Comparable{
    int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return this.x+" "+y;
    }
    @Override
    public int compareTo(Object o){
        if(this.x>((Point)o).x)
            return 1;
        else if(this.x<((Point)o).x)
            return -1;
        else{
            if(this.y>((Point)o).y)
                return 1;
            else if(this.y<((Point)o).y)
                return -1;
            else
                return 0;
        }
    }

}
