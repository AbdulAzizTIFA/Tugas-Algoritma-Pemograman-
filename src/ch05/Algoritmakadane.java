package ch05;

public class Algoritmakadane {
    public static void main(String[] args) {
        int [] data = {4, 5, 2, -8, 7, -9, 7, -4, 6, 10, -8};
        int nilai = 0;
        int nilaimaksimal = 0;
        int mulai = 0;
        int akhir = 0;

        for(int a = 0; a < data.length; a++){
            nilai = nilai+ data[a];
            if(nilai<0){
                nilai = 0;
                mulai = a + 1;
            }
            else  if(nilai > nilaimaksimal){
                nilaimaksimal = nilai;
                akhir = a;
            }
        }
        for(int a = mulai; a <= akhir; a++)
            System.out.println("Subarray yang berdekatan dengan jumlah terbesar adalah "+ data[a]);
        System.out.println("Jumlah subarray yang berdekatan dengan jumlah terbesar adalah "+ nilaimaksimal);
    }
}
