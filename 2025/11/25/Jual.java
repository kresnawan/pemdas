import java.util.Scanner;

public class Jual {
    public static Scanner input = new Scanner(System.in);

    static Buah apel = new Buah("Apel", 6000);
    static Buah khuldi = new Buah("Khuldi", 99999);
    static Buah anggur = new Buah("Anggur", 3000);
    static Buah nanas = new Buah("Nanas", 23000);
    static Buah jeruk = new Buah("Jeruk", 5000);

    static Buah buah[] = { apel, khuldi, anggur, nanas, jeruk };

    static int jumlahPilihan = 0;

    static Buah chosenBuah[] = new Buah[5];

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

        tambahkanBuah(buah[opsi - 1].getNama(), buah[opsi - 1].getHarga());
        System.out.printf("Buah %s berhasil ditambahkan!\n", buah[opsi - 1].getNama());
    }

    public static void tampilkanBuah() {
        System.out.printf("LIST BUAH\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d - %s, %d\n", i + 1, buah[i].getNama(), buah[i].getHarga());
        }
    }

    public static void tambahkanBuah(String nama, int harga) {
        Buah pilihan = new Buah(nama, harga);
        chosenBuah[jumlahPilihan] = pilihan;

        jumlahPilihan++;
    }

    public static void tampilkanPilihan() {
        System.out.printf("LIST PILIHAN ANDA: %d/5\n", jumlahPilihan);
        for (int i = 0; i < jumlahPilihan; i++) {
            System.out.printf("%d - %s, %d\n", i + 1, chosenBuah[i].getNama(), chosenBuah[i].getHarga());
        }

        int totalHarga = 0;

        for (int j = 0; j < jumlahPilihan; j++) {
            totalHarga += chosenBuah[j].getHarga();
        }

        System.out.printf("Total harga: %d\n", totalHarga);
    }
}
