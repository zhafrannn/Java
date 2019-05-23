import javax.swing.JOptionPane;
import java.util.*;

public class Array2Dimensi
{
    public static void main(String [] args)
    {
        String juml="";
        int jumlah;
        
        juml=JOptionPane.showInputDialog("Jumlah Data : ");
        jumlah=Integer.parseInt(juml);
        
        int no[][]=new int [jumlah][6];
        String namaS[][]=new String [jumlah][6];
        String nilai1S[][]=new String [jumlah][6];
        String nilai2S[][]=new String [jumlah][6];
        double nilai1[][]=new double [jumlah][6];
        double nilai2[][]=new double [jumlah][6];
        double total[][]=new double [jumlah][6];
        double rata[][]=new double [jumlah][6];
        
        
        for(int i=0;i<jumlah;i++)
        {
                no[i][0]=(i+1);
                namaS[i][1]=JOptionPane.showInputDialog("Nama  Siswa ke -"+(i+1)+" : ");
                nilai1S[i][2]=JOptionPane.showInputDialog("Nilai 1 Siswa ke -"+(i+1)+" : ");
                nilai2S[i][3]=JOptionPane.showInputDialog("Nilai 2 Siswa ke -"+(i+1)+" : ");z
                nilai1[i][2]=Double.parseDouble(nilai1S[i][2]);
                nilai2[i][3]=Double.parseDouble(nilai2S[i][3]);
                total[i][4]=(nilai1[i][2])+(nilai2[i][3]);
                rata[i][5]=(total[i][4])/2;
        }
        
        System.out.println("No\tNama\tNilai1\tNilai2\tTotal\tRata2");
        System.out.println("======================================");
        
        for(int i=0;i<jumlah;i++)
        {
                System.out.print(i+1);
                System.out.print("\t");
                System.out.print(namaS[i][1]);
                System.out.print("\t");
                System.out.print(nilai1[i][2]);
                System.out.print("\t");
                System.out.print(nilai2[i][3]);
                System.out.print("\t");
                System.out.print(total[i][4]);
                System.out.print("\t");
                System.out.print(rata[i][5]);
                System.out.println("");
        }
      }
}