package ch03;
import java.util.Scanner ;
    public class Responsi51b {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a,b,c;
        System.out.print("masukkan angka pertama:");
        a=x.nextInt();
        System.out.print("masukkan angka kedua:");
        b=x.nextInt();
        System.out.print("masukkan angka ketiga:");
        c=x.nextInt();
        {
            if(a>b && a>c && b>c)
            {
                System.out.println("Angka terbesar:"+a);
                System.out.println("Angka terkecil:"+b);
            }

            else if(a>b && a>c && b>c)
            {
                System.out.println("Angka terbesar:"+a);
                System.out.println("Angka terkecil:"+c);
            }
            else if(b>a && b>c && b>a   )
            {
                System.out.println("Angka terbesar:"+b);
                System.out.println("Angka terkecil:"+a);
            }
            else if ( b>a && b>c && a>c)
            {
                System.out.println("Angka terbesar:"+b);
                System.out.println("Angka terkecil:"+c);
            }
            else if (c>a && c>b && b>a)
            {
                System.out.println("Angka terbesar:"+c);
                System.out.println("Angka terkecil:"+a);
            }
            else if (c>a && c>b && a>b)
            {
                System.out.println("Angka terbesar:"+c);
                System.out.println("Angka terkecil:"+b);
            }
        }

    }
}