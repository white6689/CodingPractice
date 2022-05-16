package D0514;

public class QNC_1 {
    public static void main(String[] args){
        String p="110";
        String s="110110110";
        int count=0;
        for(int i=0;i<=s.length()-p.length();){
            if(p.equals(s.substring(i, i+p.length()))){
                ++count;
                i=i+p.length();
            }
            else
                ++i;
        }
//        if(count==0)
//            return -1;
//        else

        if(count*p.length()==s.length())
            System.out.println("heh");
        System.out.println(count);


    }
}
