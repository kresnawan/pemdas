class Pelanggan {
	private long no_pelanggan;
	private long saldo;
	private String nama;
	private int pin;
	private String jenisRekening;

	public Pelanggan(long n, long s, String nm, int p) {
		cekJenisRekening(n);
		this.no_pelanggan = n;
		this.saldo = s;
		this.nama = nm;
		this.pin = p;
	}

	public long getNoPelanggan() {
		return this.no_pelanggan;
	}

	public long getSaldo() {
		return this.saldo;
	}

	public int getPin() {
		return this.pin;
	}

	public boolean uangIsCukup(int nominal) {
		if (this.saldo - nominal < 10000) {
			return false;
		} else {
			return true;
		}
	}

	public void kurangiSaldo(int nominal) {
		this.saldo -= nominal;
	}

	public String getNama() {
		return this.nama;
	}

	public boolean checkPin(int pin) {
		if (this.pin == pin) {
			return true;
		} else {
			return false;
		}
	}

	public String getJenisRekening() {
		return this.jenisRekening;
	}

	private void cekJenisRekening(long n) {
		if (String.valueOf(n).startsWith("38")) {
			this.jenisRekening = "silver";
		} else if (String.valueOf(n).startsWith("56")) {
			this.jenisRekening = "gold";
		} else if (String.valueOf(n).startsWith("74")) {
			this.jenisRekening = "platinum";
		} else {
			System.err.println("Error: Nomor pelanggan tidak valid, program dihentikan");
			System.exit(0);
		}
	}
}