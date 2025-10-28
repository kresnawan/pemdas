import java.util.Scanner;
import java.lang.Math;

public class Program {

    public static int ulang = 1;

    public static Scanner input = new Scanner(System.in);
    public static int luasPersegi(int sisi) {
        int hasil = sisi * sisi;
        return hasil;
    }
    
    public static double luasPersegi(double P, double L) {
    	double hasil = P * L;
        return hasil;
    }
    
    public static double luasSegitiga(double A, double T) {
        double hasil = (double) 1/2 * A * T;
        return hasil;
    }

    public static double luasLingkaran(double R) {
    	double hasil = (double) Math.PI * (R * R);
	return hasil;
    }

    public static void mintaUlang() {
        System.out.println();
	System.out.print("Apakah anda ingin mengulangi? [Y/n] : ");
	input.nextLine();
	
	String input5 = input.nextLine();
	input.nextLine();
	if (input5 == "Y") {
            ulang = 1;
        } else {
            ulang = 0;
        }
	
    }
    
    public static void main(String[] args) {
	while (ulang == 1) {





        System.out.println("Anda mau mengukur luas apa?");
	System.out.println("1. Luas persegi");
	System.out.println("2. Luas persegi panjang");
	System.out.println("3. Luas segitiga");
	System.out.println("4. Luas lingkaran");

	System.out.println();
	
	System.out.print("Masukkan opsi anda: ");
	int input1 = input.nextInt();

	if (input1 == 1) {
	    System.out.println("Menghitung luas persegi");
	    System.out.print("Masukkan panjang sisi : ");
            input.nextLine();
	    int input2 = input.nextInt();
	    
            int hasil = luasPersegi(input2);
	    System.out.println("Hasil luas: " + hasil);
	    

	} else if (input1 == 2) {
            System.out.println("Menghitung luas persegi panjang");

	    System.out.print("Masukkan panjang : ");
            input.nextLine();
	    double panjang = input.nextDouble();
            
            System.out.println();

            System.out.print("Masukkan lebar : ");
            input.nextLine();
	    double lebar = input.nextDouble();

	    System.out.println();
	    
            double hasil = luasPersegi(panjang, lebar);
	    System.out.println("Hasil luas: " + hasil);


        } else if (input1 == 3) {
            
            System.out.println("Menghitung luas segitiga");

	    System.out.print("Masukkan alas : ");
            input.nextLine();
	    double alas = input.nextDouble();
            
            System.out.println();

            System.out.print("Masukkan tinggi : ");
            input.nextLine();
	    double tinggi = input.nextDouble();

	    System.out.println();
	    
            double hasil = luasSegitiga(alas, tinggi);
	    System.out.println("Hasil luas: " + hasil);


        } else if (input1 == 4) {
        
            System.out.println("Menghitung luas lingkaran");

	    System.out.print("Masukkan jari-jari : ");
            input.nextLine();
	    double jariJari = input.nextDouble();
            
            System.out.println();
	    
            double hasil = luasLingkaran(jariJari);
	    System.out.println("Hasil luas: " + hasil);



        } else {
            System.out.println("Opsi tidak tersedia");
        }
	
	
	

	mintaUlang();


	}
    }
}