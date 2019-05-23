import java.util.*;
public class kuadrat{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan batas angka : ");
		int n = input.nextInt();
		int e=0;
		for(int i=1 ; i<=n; i){
			int c = i*i;

			System.out.println("kuadrat : "c);
		}
		
	}
}