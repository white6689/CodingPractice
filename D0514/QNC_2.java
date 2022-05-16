package D0514;

public class QNC_2 {
    public static void main(String[] args){
        String[] birth={"1899-13-31", "19001231", "2001-09-04", "1900-02-29", "2021-5-31", "1950-11-30", "1996-02-29", "1999-11-31", "2000-02-29"};
        int count=0;
        for(int i=0;i<birth.length;i++){
            String[] date=birth[i].split("-");
            //YYYY-MM-DD
//            for(String dates:date)
//                System.out.print(dates+" ");
//            System.out.println();
            if(date.length!=3)
                continue;
            if(date[0].length()!=4||date[1].length()!=2||date[2].length()!=2)
                continue;
            int year=Integer.valueOf(date[0]);
            int month=Integer.valueOf(date[1]);
            int day=Integer.valueOf(date[2]);

            if(year>=1900&&year<=2021) {
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    if(day>=1&&day<=31){
                        count++;
//                        System.out.println("correct "+birth[i]);
                        continue;
                    }
                }
                else if(month==4||month==6||month==9||month==11){
                    if(day>=1&&day<=30){
                        count++;
//                        System.out.println("correct "+birth[i]);
                        continue;
                    }
                }
                else if(month==2&&(year%400==0||(year%4==0&&year%100!=0))){
                    if(day>=1&&day<=29){
                        count++;
//                        System.out.println("correct "+birth[i]);
                        continue;
                    }
                }
                else if(month==2){
                    if(day>=1&&day<=28){
                        count++;
//                        System.out.println("correct "+birth[i]);
                        continue;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
