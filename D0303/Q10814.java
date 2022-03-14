package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        Signed[] arrs=new Signed[num];
        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arrs[i]=new Signed(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(arrs);
        for(int i=0;i<arrs.length;i++)
            System.out.println(arrs[i].age+" "+arrs[i].name);

    }
}
class Signed implements Comparable {
    int age;
    String name;
    public Signed(int age, String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(Object o) {
        if(this.age>((Signed)o).age)
            return 1;
        else if(this.age==((Signed)o).age)
            return 0;
        else
            return -1;
    }
}
