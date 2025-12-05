class Barang {
	private int harga;
	private String nama;

	public Barang(String n, int h) {
		this.harga = h;
		this.nama = n;
	}

	public String getNama() {
		return this.nama;
	}

	public int getHarga() {
		return this.harga;
	}
}