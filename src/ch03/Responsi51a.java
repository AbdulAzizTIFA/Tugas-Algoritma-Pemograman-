package ch03;
import java.util.Scanner ;
public class Responsi51a {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x,y;
        System.out.print("masukkan nilai variabel x :");
        x=in.nextInt();
        System.out.print("masukkan nilai variabel y :");
        y =in.nextInt();
        {
            if(x>y)
            {
                System.out.println("nilai terbesar adalah x");
                System.out.println("nilai terkecil adalah y");
            }

            else if( y>x)
            {
                System.out.println("nilai terbesar adalah y");
                System.out.println("nilai terkecil adalah x");
            }

        }

    }
}