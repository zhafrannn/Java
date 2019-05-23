import java.util.Scanner;
public class IfBersarang{
	public static void main(String[] args){
		System.out.println ("Program ganjil genap");
		System.out.println ("--------------------");
		int bil;
		Scanner input = new Scanner(System.in);
		System.out.println ("Masukkan bilangan : ");
		bil= input.nextInt();
		if(bil%2==0){
			if(bil>0)
			System.out.println ("Genap Positif");
			else
			System.out.println ("Genap negatif");
		}

		else{
			if(bil>0)
			System.out.println ("Ganjil Positif");
			else
			System.out.println ("Ganjil negatif");
		}
		if(bil==0)
			System.out.println ("nol");
	}		
}		

