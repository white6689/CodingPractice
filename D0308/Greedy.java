package D0308;

import java.io.*;
import java.util.*;

public class Greedy {
    public static void main(String[] args){
        //활동 정보를 list에 저장하고 정렬
        ArrayList<Action> list=new ArrayList<>();
        list.add(new Action("A", 7, 8));
        list.add(new Action("B", 5, 7));
        list.add(new Action("C", 3, 6));
        list.add(new Action("D", 1, 2));
        list.add(new Action("E", 6, 9));
        list.add(new Action("F", 10, 11));

        //종료 시간 기준으로 정렬
        Collections.sort(list);
        //이부분이 greedy, 함수로 만들면 좋음!
        System.out.print(list.get(0).name);
        for(int i=1;i<list.size();i++){
            //종료시간과 시작시간이 매칭된다면 출력
            if(list.get(i-1).terminate_time<=list.get(i).start_time)
                System.out.print("->"+list.get(i).name);
        }
    }
}
//도착 시간 기준으로 정렬
class Action implements Comparable<Action>{
    String name;
    int start_time;
    int terminate_time;

    public Action(String n, int st, int tt){
        this.name=n;
        this.start_time=st;
        this.terminate_time=tt;
    }
    @Override
    public int compareTo(Action o) {
        if(this.terminate_time>o.terminate_time)
            return 1;
        else if(this.terminate_time<o.terminate_time)
            return -1;
        else
            return 0;
    }
}