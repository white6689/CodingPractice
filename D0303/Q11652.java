package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //(key, count) 만들어서 저장하고, 또 Count 배열을 생성해 여기서 저장을 한다.
        Map<Long, Integer> map=new HashMap<>(n);
        for(int i=0;i<n;i++){
            Long input=Long.parseLong(br.readLine());
            if(map.get(input)==null)
                map.put(input, 1);
            else{
                int count=map.get(input);
                map.put(input, ++count);
            }
        }
        //Count 배열에 저장을 한다.
        Count[] arr_count=new Count[map.size()];
        int i=0;
        for(Long key:map.keySet()){
            arr_count[i]=new Count(key, map.get(key));
            ++i;
        }
        //정렬
        Arrays.sort(arr_count);
        System.out.println(arr_count[0]);
    }
}
class Count implements Comparable<Count>{
    long key;
    int count;
    Count(long key, int count){
        this.key=key;
        this.count=count;
    }
    @Override
    public String toString(){
        return key+"";
    }
    @Override
    public int compareTo(Count o) {
        if(this.count<o.count)
            return 1;
        else if(this.count>o.count)
            return -1;
        else{
            if(this.key>o.key)
                return 1;
            else if(this.key<o.key)
                return -1;
            else
                return 0;
        }
    }
}
