package ch06;

public class Bubblesort {
	public static void main (String [] args ) {
		int i ;
		int [] data = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3} ;
		urutkan ( data, data.length) ;
		
		System.out.println ("Hasil pengurutan data: ") ;
		tampilkanLarik (data, data.length);
		
	}
	public static void tampilkanLarik ( int [] data, int n ) {
		for (int i = 0 ; i < n; i ++ )
			System.out.printf ("%d ", data [i] ) ;
			System.out.println();
			
	}
	public static void urutkan (int [] data,int n ) {
		int tahap, j, tmp;
		
		for ( tahap = 1; tahap < n ; tahap++) {
			for ( j = 0; j < n - tahap ; j ++ )
				if (data [j] > data [j+1] ) {
					// Tukarkan
					tmp = data [j];
					data [j] = data [j+1] ;
					data [j+1] = tmp;
				}
				
			System.out.printf(" Hasil tahap %d :" ,tahap);
			
			tampilkanLarik (data, n) ;
		
		}
	}
}
			
			 
			 