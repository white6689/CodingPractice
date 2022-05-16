package D0514;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QNC_3 {
    public static void main(String[] args){
        int[][] beverage={{2, 3,2}, {3, 4,5}, {2, 7,1}, {5, 2, 1}};
        ArrayList<Integer>[] arr=new ArrayList[beverage.length];
        for(int i=0;i<beverage.length;i++)
            arr[i]=new ArrayList(Arrays.asList(beverage[i]));
        int p=15;
        int kcal=0;
        Arrays.sort(beverage, (o1, o2)->{
            if(o1[2]==o2[2])
                return Integer.compare(o2[1], o1[1]);
            else
                return Integer.compare(o1[2], o2[2]);
        });
        for(int i= arr.length-1;i>=0;i--){
            int j=0;
            for(j=0;j<arr[i].get(0);j++){
                if(p-j*arr[i].get(1)<0)
                    break;
            }
            p=p-(j-1)*arr[i].get(1);
            kcal=kcal+(j-1)*arr[i].get(2);
        }


    }

}
