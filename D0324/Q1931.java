package D0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1931 {
    static ArrayList<Time> list;
    static int count=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        list=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            list.add(new Time(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));
        }
        Collections.sort(list);
        for(Time o:list)
            System.out.println("start: "+o.start+", end: "+o.end);
        System.out.println("==end==");
        greedy(0);
        System.out.println(count);
    }
    static void greedy(int start){
        for(int i=start+1;i<list.size();i++){
            if(list.get(start).end<=list.get(i).start){
                ++count;
                greedy(i);
                return;
            }
        }
        //return;
    }
}
class Time implements Comparable<Time>{
    long start, end;
    public Time(long s, long e){
        this.start=s;
        this.end=e;
    }
    @Override
    public int compareTo(Time o) {
        if(this.end>o.end)
            return 1;
        else if(this.end==o.end){//시작시간과 비교한다.
            if(this.start>o.start)
                return 1;
            else if(this.start==o.start)
                return 0;
            else return -1;
        }
        else
            return -1;
    }
}