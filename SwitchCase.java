import java.util.Scanner;
public class SwitchCase{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Program n :");
		int n = input.nextInt();
		System.out.println("Program Pilihan :");
		System.out.println("Program Pangkat 2");
		System.out.println("Program Pangkat 3");
		System.out.println("Program akar 2");
		System.out.println("Program 1/n");
		System.out.println("Masukan Pilihan Anda : ");
		int pil = input.nextInt();
		
		switch(pil){
			case 1:
				System.out.println("Hasil : "+ math.pow(n,2));
				break;
			case 2:
				System.out.println("Hasil : "+ math.pow(n,2));
				break;
			case 3:
				System.out.println("Hasil : "+ sqrt(n));
				break;
			case 4:
				System.out.println("Hasil : "+ 1/n);
				break;
				
			default:
				System.out.println("Maaf anda salah input");
		}
        }
	}
}