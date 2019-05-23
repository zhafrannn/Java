import java.util.Scanner;
public class Bintang2{
	public static void main (String[] args){
		System.out.println ("Program Bintang2");
		System.out.println ("---------------");
		int i, j;
		
		for(i=1 ; i<=9 ; i+=2){
			for(j=1 ; j<=i ; j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}