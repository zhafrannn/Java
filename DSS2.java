import java.util.*;
import java.io.IOException;
public class DSS2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int a=0, b=0, c=0;
		char jwb;
			
			System.out.println("Program Menentukan Cara Belajar");
			
			System.out.println("\n1 Kalau ada orang yang meminta petunjuk jalan, biasanya saya akan...");
		    System.out.print("\na. Menggambar peta jalan pada sebuah kertas");
		    System.out.print("\nb. Memberitahu secara lisan (melalui ucapan)");
		    System.out.print("\nc. Mencoba memberitahu dengan isyarat tangan atau langsung mengantarnya");
		    System.out.print("\n\nInput jawaban: ");
			jwb = input.next().charAt(0);
		
		    if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
		
		
			System.out.print("\n2. Saya paling suka permainan...");
		    System.out.print("\na. Kata bergambar");
		    System.out.print("\nb. Acak kata");
		    System.out.print("\nc. Pantomin");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
			
			System.out.print("\n3. Saya ingin sekali menonton film di bioskop karena....");
		    System.out.print("\na. Melihat cover iklan yang menarik");
		    System.out.print("\nb. Membaca sinopsis cerita");
		    System.out.print("\nc. Menonton potongan film");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
			
			System.out.print("\n4. Saya punya guru favorit. Saat mengajar, ia selalu menggunakan...");
		    System.out.print("\na. Ceramah, diskusi, dan debat");
		    System.out.print("\nb. Diagram, bagan, alur, dan slide");
		    System.out.print("\nc. Trial, uji coba, dan praktik");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
			
			System.out.print("\n5. Ketika bicara, biasanya saya paling suka...");
		    System.out.print("\na. Suka berbicara, perlahan, dan jelas, tetapi tidak suka mendengarkan terlalu lama");
		    System.out.print("\nb. Suka mendengarkan orang lain bicara, baru kemudian bicara");
		    System.out.print("\nc. Berbicara dengan menggunakan bahasa tubuh dan gerakan banyak");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n6. Sebelum mengerjakan sesuatu, saya biasanya...");
		    System.out.print("\na. Membaca instruksinya terlebih dahulu");
		    System.out.print("\nb. Mendengarkan instruksi dari orang lain, baru mengerjakan");
		    System.out.print("\nc. Langsung melakukan uji coba");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n7. Ketika lupa sesuatu, biasanya saya...");
		    System.out.print("\na. Berusaha mengingat dari gambaran bentuk, warna, atau cirinya");
		    System.out.print("\nb. Berusaha mengingat dari ciri suaranya");
		    System.out.print("\nc. Berusaha mengingat apa yang dilakukan dan penggunaannya");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n8. Hal yang paling bisa saya ingat dari seseorang adalah...");
		    System.out.print("\na. Ekspresi wajah yang menawan");
		    System.out.print("\nb. Suaranya yang khas");
		    System.out.print("\nc. Gerakan tubuhnya yang memukau");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n9. Saat berkomunikasi, saya suka kalau ...");
			System.out.print("\na. Bertemu secara langsung");
			System.out.print("\nb. Bicara melalui telepon");
			System.out.print("\nc. Bertemu dalam sebuah kegiatan aktif");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n10. Kemampuan yang saya bisa dan paling saya sukai adalah....");
			System.out.print("\na. Menggambar, melukis, atau mewarnai");
			System.out.print("\nb. Bernyanyi atau bermain alat musik");
			System.out.print("\nc. Menari atau beladiri");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
			
		
			System.out.print("\n11. Ketika santai, saya biasanya...");
			System.out.print("\na. Membaca novel atau buku");
			System.out.print("\nb. Mendengarkan musik atau radio");
			System.out.print("\nc. Berolahraga atau bermain");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
			
			System.out.print("\n12. Saat marah, saya biasanya...");
			System.out.print("\na. Lebih memilih untuk diam saja");
			System.out.print("\nb. Memaki dan berkata-kata secara emosional");
			System.out.print("\nc. Membanting barang atau memukul");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
			if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n13. Konsentrasi saya terganggu jika...");
			System.out.print("\na. Kondisi ruangan yang berantakan dan tidak rapi");
			System.out.print("\nb. Bising dan suara  gaduh");
			System.out.print("\nc. Gerakan yang ada di sekitar");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
		    if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
				
			System.out.print("\n14. Saat belajar, saya biasanya...");
			System.out.print("\na. Membuat catatan atau rangkuman materi");
			System.out.print("\nb. Menghafal sambil menggunakan suara");
			System.out.print("\nc. Melakukan praktik atau simulasi dari pelajaran");
			System.out.print("\n\nInput jawaban: ");
		    jwb = input.next().charAt(0);
			
		    if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
			
		
				
			System.out.print("\n15. Saat membaca sesuatau, saya biasanya....");
			System.out.print("\na. Menyukai bacaan yang bercerita tentang detil peristiwa");
			System.out.print("\nb. Menyukai bacaan yang memiliki banyak percakapan antar tokoh");
			System.out.print("\nc. Menyukai bacaan yang melibatkan aksi dari tokohnya");
			System.out.print("\n\nInput jawaban: ");
			jwb = input.next().charAt(0);
			
		   if (jwb == 'A' || jwb == 'a')
				a++;
			else if (jwb == 'B' || jwb == 'b')
				b++;
			else if (jwb == 'C' || jwb == 'c')
				c++;
					

		//Proses			
		if(a > b){
			if (a > c)
				System.out.print("Tipe Belajar Visual");
			
			else if (a == c)
				System.out.print("Tipe Belajar Visual dan Kinestetik");
			
			else //c
				System.out.print("Tipe Belajar Kinestetik");
		}
		
	
		else if(b > a){
			if (b > c)
				System.out.print("Tipe Belajar Auditori");
			
			else if (b == c)
				System.out.print("Tipe Belajar Auditori dan Kinestetik");
			
			else //c
				System.out.print("Tipe Belajar Kinestetik");
		}
		
		else if(a > c ){
			if(a==b)
				System.out.print("Tipe Belajar Auditori dan Visual");
		}
		
		else if(a == b && a == c){
			System.out.print("Tipe Belajar Visual, Auditori, dan Kinestetik");
		}	
		
		
	}
}