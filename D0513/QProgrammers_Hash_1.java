package D0513;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QProgrammers_Hash_1 {
    public static void main(String[] args){
        String[] part={"leo", "kiki", "eden"};
        String[] comp={"eden", "kiki"};

        HashMap<String, Integer> map=new HashMap<>();
        for(String players:part){
            map.put(players, map.getOrDefault(players, 0)+1);
        }
        for(String players:comp)
            map.put(players, map.getOrDefault(players, 0)-1);
        System.out.println(map);

        Iterator<Map.Entry<String, Integer>> iter=map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry=iter.next();
            if(entry.getValue()!=0){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
