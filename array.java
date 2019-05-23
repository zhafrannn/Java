import java.util.*;
public class array{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Masukan Jumlah baris(1-10) : ");
		int jml= input.nextInt();
		if(jml>=1 && jml<=10){*/
			
			System.out.print("Masukan baris : ");
			int b= input.nextInt();
			System.out.print("Masukan kolom : ");
			int k= input.nextInt();
			
			for(int j=0; j<b; j++){	
				for(int l=0; l<k; l++){
					
					int id[][]= new int [j][l];
					System.out.print("Masukan nilai indeks ke-" + "(" + j + "."+ l + ")" + ": ");
					id[j][l]= input.nextInt();
					
				}
			}
			
			for(int j=0; j<b; j++){	
				for(int l=0; l<k; l++){
					
					System.out.print(""+id[j][l]+" ");
					
				}
				System.out.println("");
			}
			/*
			for(int i=0; i<jml; i++){

			}
		}
		
		else
			System.out.println("Salah input ");*/
	}
}