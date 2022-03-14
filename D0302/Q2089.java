package D0302;

import java.util.Scanner;

public class Q2089 {
    public static void main(String[] args){
        //System.out.println((-13)/(-2));
        Scanner sc=new Scanner(System.in);
        long nums=sc.nextLong();
        printNum(nums);
//        String result="";
//        long remain=0;
//        long num=sc.nextLong();
//        int i=0;
//        while(true){
//            //몫이 1이면 붙이고 종료
//            if(num==1){
//                result="1";
//                break;
//            }
//            //나누는 수가 음수면
//            if(num<0){
//                if(num%2!=0)
//                    remain=(num/(-2))+1;
//                else
//                    remain=(num/(-2));
//                System.out.println(i+": "+remain);
//                result=(num-remain*(-2))+result;
//                System.out.println(i+": "+result);
//                num=remain;
//                if(num==1){
//                    result="1"+result;
//                    break;
//                }
//            }else{//나누는 수가 양수면
//                result=(num%(-2))+result;
//                System.out.println(i+": "+num/(-2));
//                System.out.println(i+": "+result);
//                num=num/(-2);
//                if(num==1){
//                    result="1"+result;
//                    break;
//                }
//            }
//            ++i;
//        }
//        System.out.println(result);
    }
    static void printNum(long num){
        String result="";
        long remain=0;
        int i=0;
        while(true){
            //몫이 1이면 붙이고 종료
            if(num==1){
                result="1";
                break;
            }
            //나누는 수가 음수면
            if(num<0){
                if(num%2!=0)
                    remain=(num/(-2))+1;
                else
                    remain=(num/(-2));
                //System.out.println(i+": "+remain);
                result=(num-remain*(-2))+result;
                //System.out.println(i+": "+result);
                num=remain;
                if(num==1){
                    result="1"+result;
                    break;
                }
            }else{//나누는 수가 양수면
                result=(num%(-2))+result;
                //System.out.println(i+": "+num/(-2));
                //System.out.println(i+": "+result);
                num=num/(-2);
                if(num==1){
                    result="1"+result;
                    break;
                }
            }
            ++i;
        }
        System.out.println(result);
    }
}
