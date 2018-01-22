import java.io.*; //輸入字串的方法是readLine，此方法存在BufferedReader類別，此類別所在的套件是java.io
public class identify_triangle {
    public static void main(String args[]) throws IOException { //申請IOException類別的例外
        String next="";
        do {
            System.out.println("三角形的判別:");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("請輸入三角形的第一個邊長：");
            String str1=br.readLine();
            System.out.print("請輸入三角形的第二個邊長：");
            String str2=br.readLine();
            System.out.print("請輸入三角形的第三個邊長：");
            String str3=br.readLine();

            //將3個輸入的值分別轉換成整數,並分別指定給A,B,C
            int A=Integer.parseInt(str1);
            int B=Integer.parseInt(str2);
            int C=Integer.parseInt(str3);


            if(A>20||B>20||C>20) {
                System.out.println("邊長最大20!!");
                break;
            }
            if ((A==0||B==0||C==0)) {
                System.out.println("這不是三角形!!");
                break;
            }
            if(A+B<C||A+C<B||B+C<A) { //兩邊之和大於第三邊
                System.out.println("這不是三角形!!");
                break;
            }


            else
            if((A==B)&&(B==C)&&(A==C))
                System.out.println("這是一個等邊(equilateral)三角形");
            else 
            if(((A==B)||(B==C)||(A==C))&&((A*A+B*B==C*C)||(C*C+B*B==A*A)||(A*A+C*C==B*B)))
                System.out.println("這是一個等腰(isosceles)三角形");
            else
            if((A==B)||(B==C)||(A==C))
                System.out.println("這是一個等腰(isosceles)三角形");
            else
                System.out.println("這是一個不等邊(scalene)三角形");
            


            try {
                System.out.print("是否繼續(Y/N)?");
                next=br.readLine();
            }

            catch (IOException e) {
                System.exit(-1);
            }

        }

        while (next.equalsIgnoreCase("y"));
    }
}