import java.util.*;
public class AnakSmp{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan baris : ");
		int b = input.nextInt();
		System.out.print("Masukan kolom : ");
		int k = input.nextInt();
		
		int x[][] = new int [b][k];
		
		int bil=0;
		for(int i=0 ; i<b; i++){
			System.out.print("Kolom ke-"+(i+1));
			System.out.println();
			for(int j=0 ; j<k; j++){
				System.out.print("Masukkan angka ke-"+(j+1)+" : ");
				x[i][j] = input.nextInt();
			}
		}
		
		for(int y=0 ; y<b; y++){
			for(int l=0 ; l<k; l++){
				if(x[y][l]%3!=0 && x[y][l]%5!=0){
					bil = x[y][l];
				}
			}
			System.out.print(bil+" ");
			bil=0;	
		}
	}
}