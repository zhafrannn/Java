import java.util.Scanner;
public class Bintang3{
	public static void main (String[] args){
		System.out.println ("Program Bintang");
		System.out.println ("---------------");
		int i, j;
		
		for(i=1; i<=9; i+=2){
			for(j=9; j>=i; j--){
			System.out.print(" *");
			}
			System.out.println();
		}
	}
}