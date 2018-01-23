import java.util.*;

public class TRIANGLE {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    static void test() {
        int a, b, c;

        System.out.print("請輸入三個整數：");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if( a>20 || b>20 || c>20) {
                System.out.println("邊長最大20!!");
        }
        if ( a==0 || b==0 || c==0 ) {
                System.out.println("這不是三角形!!");
        }

        if ((a+b>c) && (b+c>a) && (c+a>b)) {
            if ((a==b) && (b==c) && (a==c)) {
                System.out.println("這是一個等邊(equilateral)三角形");
            }
            else if (((a==b) || (b==c) || (a==c)) && ((a*a+b*b==c*c) || (c*c+b*b==a*a) || (a*a+c*c==b*b))) {
                System.out.println("這是一個等腰(isosceles)三角形");
            }
            else if ((a==b) || (b==c) || (a==c)) {
                System.out.println("這是一個等腰(isosceles)三角形");
            }
            else
                System.out.println("這是一個不等邊(scalene)三角形");
        }
    }

}