import java.util.Scanner;

public class Program {
	public static Scanner input = new Scanner(System.in);

	private static Barang b1 = new Barang("Barang 1", 23000);
	private static Barang b2 = new Barang("Barang 2", 75000);
	private static Barang b3 = new Barang("Barang 3", 50000);
	private static Barang b4 = new Barang("Barang 4", 95000);
	private static Barang[] barangs = { b1, b2, b3, b4 };

	private static Pelanggan akunSilver = new Pelanggan(3812345678L, 100000, "Kresnawan", 1234);
	private static Pelanggan akunGold = new Pelanggan(5612345678L, 100000, "Dafa", 2341);
	private static Pelanggan akunPlatinum = new Pelanggan(7412345678L, 100000, "Grace", 3412);
	private static Pelanggan[] akun = { akunSilver, akunGold, akunPlatinum };

	private static String[] opsi = { "Beli barang", "Lihat akun" };
	private static long[] bannedAkun = new long[0];
	private static int loggedInAs;

	public static void main(String[] args) {
		login();
	}

	private static void login() {
		System.out.printf("Anda login sebagai : \n");

		for (int h = 0; h < akun.length; h++) {

			boolean isBanned = false;
			for (int k = 0; k < bannedAkun.length; k++) {
				if (akun[h].getNoPelanggan() == bannedAkun[k]) {
					isBanned = true;
					break;
				}
			}

			if (isBanned) {
				System.out.printf("%d - %-15s %-8s (%s)\n",
						h + 1,
						akun[h].getNama(),
						akun[h].getJenisRekening(),
						"banned");
			} else {
				System.out.printf("%d - %-15s %-8s (%s)\n",
						h + 1,
						akun[h].getNama(),
						akun[h].getJenisRekening(),
						"active");
			}
		}

		System.out.printf("Masukkan opsi anda: ");
		int opsiKu = input.nextInt();
		for (int i = 0; i < akun.length; i++) {
			if (opsiKu - 1 == i) {
				boolean isBanned = false;
				for (int k = 0; k < bannedAkun.length; k++) {
					if (akun[i].getNoPelanggan() == bannedAkun[k]) {
						isBanned = true;
						break;
					}
				}

				if (isBanned) {
					System.out.printf("Akun telah diban, akses dibatalkan\n");
					login();
				}

				loggedInAs = i;
				System.out.printf("Anda terlogin sebagai %s, dengan akun berjenis %s!\n",
						akun[i].getNama(),
						akun[i].getJenisRekening());
				System.out.printf("Happy shopping!\n\n");
				tampilkanOpsi();
			}
		}
	}

	private static void tampilkanOpsi() {
		for (int i = 0; i < opsi.length; i++) {
			System.out.printf("%d - %s\n", i + 1, opsi[i]);
		}
		System.out.printf("Apa yang ingin anda lakukan? (nomor): ");
		int pO = input.nextInt();

		if (pO == 1) {
			beliBarang();
		} else if (pO == 2) {
			lihatAkun();
		}
	}

	private static void tampilkanBarang() {
		System.out.printf("\n=== Barang yang tersedia: ===\n");
		for (int i = 0; i < barangs.length; i++) {
			System.out.printf("%d - %s %d\n",
					i + 1,
					barangs[i].getNama(),
					barangs[i].getHarga());
		}
	}

	private static void beliBarang() {
		tampilkanBarang();
		System.out.printf("Barang mana yang akan anda beli (nomor): ");
		int opt = input.nextInt();

		for (int i = 0; i < barangs.length; i++) {
			if (i == opt - 1) {
				if (!akun[loggedInAs].uangIsCukup(barangs[i].getHarga())) {
					System.out.printf("Saldo tidak cukup, transaksi dibatalkan\n\n");
					tampilkanOpsi();
				}
				System.out.printf("Anda akan membeli %s seharga %d\n", barangs[i].getNama(), barangs[i].getHarga());
				cekPin(i);
			}
		}

	}

	private static void cekPin(int i) {
		for (int j = 0; j < 3; j++) {
			System.out.printf("Masukkan pin anda : ");

			int pin = input.nextInt();
			if (j == 2) {
				System.out.printf("Terlalu banyak percobaan yang salah, anda akan dilogout dan akun ini tidak akan bisa dipakai\n");
				tambahBannedAkun(akun[loggedInAs].getNoPelanggan());
				loggedInAs = -1;
				login();

			} else if (pin != akun[loggedInAs].getPin()) {
				System.out.printf("Pin yang anda masukkan salah, coba lagi\n");

			} else {
				akun[loggedInAs].kurangiSaldo(barangs[i].getHarga());
				System.out.printf("Transaksi berhasil, saldo anda tersisa %d\n\n", akun[loggedInAs].getSaldo());
				tampilkanOpsi();
				break;
			}

		}
	}

	private static void lihatAkun() {
		System.out.printf("\n=== Informasi akun ===\n");
		System.out.printf("Nomor pelanggan : %d\n", akun[loggedInAs].getNoPelanggan());
		System.out.printf("Nama pelanggan : %s\n", akun[loggedInAs].getNama());
		System.out.printf("Saldo : %d\n\n", akun[loggedInAs].getSaldo());

		tampilkanOpsi();
	}

	private static void tambahBannedAkun(long id) {
		// tempArray length = 1
		long[] tempArray = new long[bannedAkun.length + 1];

		for (int i = 0; i < tempArray.length - 1; i++) {
			tempArray[i] = bannedAkun[i];
		}

		tempArray[tempArray.length - 1] = id;
		bannedAkun = tempArray;
	}
}
