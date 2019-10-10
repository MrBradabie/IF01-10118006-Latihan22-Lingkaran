
package if01.pkg10118006.latihan22.lingkaran;
import java.util.Scanner;
/*
 * NAMA              : Alfarizi RIzki Pane
 * KELAS             : IF-01
 * NIM               : 1011806
 * DESKRIPSI PROGRAM : Program yang dapat menghitung luas dan keliling lingkaran
 */

public class IF0110118006Latihan22Lingkaran {
   
    public static void main(String[] args) {

        // TODO code application logic here

        double d,r, luas,keliling;
        System.out.println("Perhitungan lingkaran");
        System.out.println("=================================");        
        Scanner scanner;
        do{
            System.out.println("Diamter harus berupa angka!!");
            System.out.print("Diameter: ");
            System.out.println("");
            scanner = new Scanner(System.in);
        }while(!scanner.hasNextDouble());
        d = scanner.nextDouble();
        r = d * 0.5;
        luas = Math.PI * r * r;
        keliling = d * Math.PI;
         System.out.println("Hasil");
            System.out.println("=================================");
            System.out.printf("Jari jari\t: %,12.2f cm%n" ,r);
            System.out.printf("Luas\t\t: %,12.2f cm%n" ,luas);
            System.out.printf("Keliling\t: %,12.2f cm%n" ,keliling);
    }
}