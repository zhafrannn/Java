import java.util.Scanner;
public class Bintang{
	public static void main (String[] args){
		System.out.println ("Program Bintang");
		System.out.println ("---------------");
		int i, j;
		
		for(i=5; i>0; i--){
			for(j=i; j>0; j--){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}