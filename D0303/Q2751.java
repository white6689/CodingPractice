package D0303;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Q2751 {
    //어이가 없네, Collections.sort 를 쓰면 된다.ㅎ
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int num=Integer.parseInt(br.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<num;i++)
            list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        for(int value:list)
            sb.append(value).append('\n');
        System.out.println(sb);
    }
}
