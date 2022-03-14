package D0307;

public class BItMask {
    public static void main(String[] args){
        byte b=40;//8비트
        short s=40;//16비트
        int i=40;//32비트

       //byte, short는 toBinaryString이 없어서 Integer를 사용한다.
       //0xFF는 8비트로 11111111임으로 &(AND) 연산을 통해 결과를 나타낼 수 있다
        String bs=String.format("%8s", Integer.toBinaryString(~b&0xFF));
        System.out.println("Byte 40 NOT: "+~b+", 2진수 출력: "+bs);
        //0xFFFF는 16비트로 1111111111111111임으로 & 연산을 통해 결과를 나타낼 수 있다.
        String ss=String.format("%16s", Integer.toBinaryString(~s&0xFFFF)).replace(' ', '0');
        System.out.println("Short 40 NOT: "+~s+", 2진수 출력: "+ss);
        System.out.println("Int 40 NOT: "+~i+", 2진수 출력: "+Integer.toBinaryString(~i));

    }
}
