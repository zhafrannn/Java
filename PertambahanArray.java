import java.util.Scanner;
public class PertambahanArray{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int j=0,terbesar=0,terkecil=0;
		int n[] = new int [5];
		
		for(int i=0 ; i<n.length ; i++ ){
			
			System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
			n[i]= input.nextInt();
			
			j = j+n[i]; 
			
			if(terbesar == 0){
				terbesar = n[i];
			}
			else if (terbesar < n[i]){
				terbesar = n[i];
			}
			if(terkecil == 0){
				terkecil = n[i];
			}
			else if (terkecil > n[i]){
				terkecil = n[i];
			}
			
        }
		
		int rata = j/n.length;
		
		System.out.println("Hasil :" + j);
		System.out.println("Rata-rata :" + rata);
		System.out.println("Bilangan terbesar :" + terbesar);
		System.out.println("Bilangan terkecil :" + terkecil);
	}
}