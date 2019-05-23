import java.util.*;
public class akar{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		for(int i=100 ; i<=200; i+=10){
			double c = Math.sqrt(i);
			System.out.println("Akar "+i+" = ");
			System.out.print(c);
		}
	}
}