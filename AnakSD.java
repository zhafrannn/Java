import java.util.*;
public class AnakSd{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan jumlah baris : ");
		int n = input.nextInt();
		
		int genap=0,ganjil=0;
		
		int x[][] = new int [n][4];
		
		for(int i=0 ; i<n; i++){
			System.out.print("Kolom ke-"+(i+1));
			System.out.println();
			for(int j=0 ; j<4; j++){
				System.out.print("Masukkan angka ke-"+(j+1)+" : ");
				x[i][j] = input.nextInt();
				
			}
		}
		
		for(int k=0 ; k<n; k++){
			for(int l=0 ; l<4; l++){
				if(x[k][l]%2==0){
					genap = genap + x[k][l];
				}
				else{
					ganjil = ganjil + x[k][l];
				}
			}
			System.out.print(ganjil+" "+genap);
			System.out.println("");
			genap=0;
			ganjil=0;		
		}
	}
}