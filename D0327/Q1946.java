package D0327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1946 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Employee> emp=new ArrayList<>();
            for(int j=0;j<n;j++){
                emp.add(new Employee(sc.nextInt(), sc.nextInt()));
            }
            Collections.sort(emp); //시간초과 날 부분
//            for(int j=0;j<n;j++){
//                System.out.println("Paper: "+emp.get(j).paper+", Visible: "+emp.get(j).visible);
//            }
            int previous=emp.get(0).visible, visible_num=emp.get(0).visible;
            int count=1;
            for(int j=1;j<n;j++){
                if(emp.get(j).visible<visible_num&&emp.get(j).visible<previous){
                    ++count;
                    previous=emp.get(j).visible;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);

    }
}
class Employee implements Comparable<Employee> {
    int paper, visible;
    public Employee(int p, int v){
        this.paper=p;
        this.visible=v;
    }
    @Override
    public int compareTo(Employee o) {
        if (this.paper > o.paper)
            return 1;
        else if (this.paper < o.paper)
            return -1;
        else
            return 0;
    }
}
