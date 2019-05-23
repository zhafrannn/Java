import java.util.*;

class Penukaran {
	public static void main(String Args[]) {
		int jumlah_input=0, banyak_kolom=0, banyak_baris=0, baris_pertama=0, baris_kedua=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Baris Pertama Jumlah Input = ");
        jumlah_input = in.nextInt();
		System.out.println("Masukkan Jumlah Baris = ");
		banyak_baris = in.nextInt();
		System.out.println("Masukkan Jumlah Kolom = ");
		banyak_kolom = in.nextInt(); 
		
		String[][] banyakData = new String [banyak_baris][banyak_kolom];
		
		String[][] simpanData = new String [2][banyak_kolom];
		
		for(int x=0; x<banyak_baris; x++) {
			for(int y=0; y<banyak_kolom; y++) {
				banyakData[x][y] = in.next();
			}
			System.out.print("\n");
		}
		
		System.out.println("Masukkan Baris Pertama yang mau ditukar");
		baris_pertama = in.nextInt();
		System.out.println("Masukkan Baris Kedua yang mau ditukar");
		baris_kedua = in.nextInt();
		
		for(int a=0; a<banyak_kolom; a++) {
			simpanData[0][a] = banyakData[baris_pertama-1][a];
			simpanData[1][a] = banyakData[baris_kedua-1][a];
		}
		
		for(int b=0; b<banyak_kolom; b++) {
			banyakData[baris_kedua-1][b] = simpanData[0][b];
			banyakData[baris_pertama-1][b] = simpanData[1][b];
		}
		
		for(int c=0; c<banyak_baris; c++) {
			for(int d=0; d<banyak_kolom; d++) {
				System.out.print(banyakData[c][d]);
			}
			System.out.print("\n");
		}
	}
}