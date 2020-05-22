package ch05;

import java.util.Scanner;

public class Algoritmaeuclidean{
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        System.out.print("Angka Pertama =");
        int nilai1 = in.nextInt();
        System.out.print("Angka  kedua =");
		
        int nilai2 = in.nextInt();
        int pertama = nilai1;
        int kedua = nilai2;

        if(nilai2==0){
            System.out.println("FPB dari "+"("+pertama+","+kedua+")"+" = "+ nilai1);
        }
        else {
            do{
                int sisabagi = nilai1%nilai2;
                nilai1 = nilai2;
                nilai2 = sisabagi;
            }while (nilai2!=0);
            System.out.println("FPB dari "+"("+pertama+","+kedua+")"+" = "+ nilai1);
        }
    }
}
