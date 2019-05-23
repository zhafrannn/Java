import java.util.*;

class tgsarray {
	public static void main(String Args[]) {
		int jumlahinput=0, jumlahkolom=0, jumlahbaris=0, baris1=0, baris2=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Baris Pertama Jumlah Input = ");
        jumlahinput = in.nextInt();
		System.out.println("Masukkan Jumlah Baris = ");
		jumlahbaris = in.nextInt();
		System.out.println("Masukkan Jumlah Kolom = ");
		jumlahkolom = in.nextInt(); 
		
		String[][] banyakData = new String [jumlahbaris][jumlahkolom];
		
		String[][] simpanData = new String [2][jumlahkolom];
		
		for(int x=0; x<jumlahbaris; x++) {
			for(int y=0; y<jumlahkolom; y++) {
				banyakData[x][y] = in.next();
			}
			System.out.print("\n");
		}
		
		System.out.println("Masukkan Baris Pertama yang mau ditukar");
		baris1 = in.nextInt();
		System.out.println("Masukkan Baris Kedua yang mau ditukar");
		baris2 = in.nextInt();
		
		for(int a=0; a<jumlahkolom; a++) {
			simpanData[0][a] = banyakData[baris1-1][a];
			simpanData[1][a] = banyakData[baris2-1][a];
		}
		
		for(int b=0; b<jumlahkolom; b++) {
			banyakData[baris2-1][b] = simpanData[0][b];
			banyakData[baris1-1][b] = simpanData[1][b];
		}
		
		for(int c=0; c<jumlahbaris; c++) {
			for(int d=0; d<jumlahkolom; d++) {
				System.out.print(banyakData[c][d]);
			}
			System.out.print("\n");
		}
	}
}