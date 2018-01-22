import java.util.*;

public class JPA02 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }

    static void test() {
        int a, b, c;

        System.out.print("請輸入三個整數：");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if ( (a+b>c) && (b+c>a) && (c+a>b) ) {
            if ( (a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b) ) {
                System.out.printf("直角三角形\n");
            }
            else if ( (a*a+b*b<c*c) || (b*b+c*c<a*a) || (c*c+a*a<b*b) ) {
                System.out.printf("鈍角三角形\n");
            }
            else {
                System.out.printf("銳角三角形\n");
            }
        } else {
            System.out.printf("不可以構成三角形\n");
        }
    }
}