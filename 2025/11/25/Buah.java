public class Buah {
    private String nama;
    private int harga;

    public Buah(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public void setHarga(int h) {
        this.harga = h;
    }
}
