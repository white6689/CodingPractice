package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        LinkedList<Score> list=new LinkedList<>();

        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            int k=Integer.parseInt(st.nextToken()), e=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
            list.add(new Score(name,k, e, m));
        }
        Collections.sort(list);
        for(Score s:list)
            System.out.println(s);
    }
}
class Score implements Comparable{
    String name;
    int k, e, m;
    public Score(String name, int k, int e, int m){
        this.name=name;
        this.k=k;
        this.e=e;
        this.m=m;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int compareTo(Object o) {
        if(this.k<((Score)o).k)
            return 1;
        else if(this.k>(((Score)o).k))
            return -1;
        else{//같으면, 영어점수가 증가하는 순서로
            if(this.e>((Score)o).e)
                return 1;
            else if(this.e<(((Score)o).e))
                return -1;
            else{
                if(this.m<((Score)o).m)
                    return 1;
                else if(this.m>(((Score)o).m))
                    return -1;
                else
                    return this.name.compareTo(((Score) o).name);
            }
        }

        //국어 점수가 감소하는 순서로
        //국어 점수가 같으면 영어점수가 증가하는 순서로
        //국어점수와 영어점수가 같으면 수학점수가 증가하는 순서로
        //모든 점수가 같으면 이름이 사준순으로 증가하는 순서로(대문자 소문자도 구분,,,)
    }
}