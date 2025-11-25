import java.util.Scanner;

public class Jual {
    public static Scanner input = new Scanner(System.in);
    static String buah[] = { "Apel", "Khuldi", "Anggur", "Nanas", "Jeruk" };
    static int harga[] = { 6000, 99999, 3000, 23000, 5000 };

    static int jumlahPilihan = 0;

    static String chosenBuah[] = new String[5];
    static int chosenHarga[] = new int[5];

    public static void main(String[] args) {
        while (true) {
            System.out.printf("Opsi:\n");
            System.out.printf("1. Beli buah\n");
            System.out.printf("2. Keranjang saya\n");
            System.out.printf("Masukkan opsi anda: ");
            int opsi = input.nextInt();

            if (opsi == 1) {
                System.out.printf("\n");
                beliBuah();
                
            } else if (opsi == 2) {
                System.out.printf("\n");
                tampilkanPilihan();
                
            } else {
                System.out.printf("\n");
                System.out.printf("Opsi tidak tersedia\n");
                
            }

            System.out.printf("\n");
        }
    }

    public static void beliBuah() {
        tampilkanBuah();
        System.out.printf("Masukkan opsi anda: ");
        int opsi = input.nextInt();

        tambahkanBuah(buah[opsi - 1], harga[opsi - 1]);
        System.out.printf("Buah %s berhasil ditambahkan!\n", buah[opsi - 1]);
    }

    public static void tampilkanBuah() {
        System.out.printf("LIST BUAH\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d - %s, %d\n", i + 1, buah[i], harga[i]);
        }
    }

    public static void tambahkanBuah(String nama, int harga) {
        chosenBuah[jumlahPilihan] = nama;
        chosenHarga[jumlahPilihan] = harga;

        jumlahPilihan++;
    }

    public static void tampilkanPilihan() {
        System.out.printf("LIST PILIHAN ANDA: %d/5\n", jumlahPilihan);
        for (int i = 0; i < jumlahPilihan; i++) {
            System.out.printf("%d - %s, %d\n", i + 1, chosenBuah[i], chosenHarga[i]);
        }

        int totalHarga = 0;

        for (int j = 0; j < jumlahPilihan; j++) {
            totalHarga += chosenHarga[j];
        }

        System.out.printf("Total harga: %d\n", totalHarga);
    }
}
