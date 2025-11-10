import java.lang.Math;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		


		Segitiga s = new Segitiga(2, 10);
		Persegi p = new Persegi(5);
		Lingkaran l = new Lingkaran(10);


		System.out.println("\nSegitiga :");
		System.out.println("Alas: " + s.getAlas());
		System.out.println("Tinggi: " + s.getTinggi());
		System.out.println("Luas: " + s.getLuas());
		System.out.println("Keliling: " + s.getKeliling() + "\n");

		System.out.println("\nPersegi :");
		System.out.println("Sisi: " + p.getSisi());
		System.out.println("Luas: " + p.getLuas());
		System.out.println("Keliling: " + p.getKeliling() + "\n");

		System.out.println("\nLingkaran :");
		System.out.println("Jari-jari: " + l.getJariJari());
		System.out.println("Luas: " + l.getLuas());
		System.out.println("Keliling: " + l.getKeliling() + "\n");
			
		



	}
}


class Segitiga {
	private double a;
	private double t;

	public Segitiga(double a, double t) {
		this.a = a;
		this.t = t;
	}

	public String getTipe() {
		return "Siku-siku";
	}

	public double getLuas() {
		return (double) 1/2 * this.a * this.t;
	}

	public double getKeliling() {
		
		return (double) Math.sqrt((a * a) + (t * t)) + t + a;
	}

	public double getAlas() {
		return this.a;
	}

	public double getTinggi() {
		return this.t;
	}

	public void setAlas(double a) {
		this.a = a;
	}

	public void setTinggi(double t) {
		this.t = t;
	}
}


class Persegi {
	private double s;

	public Persegi(double s) {
		this.s = s;
	}

	public double getLuas() {
		return this.s * this.s;
	}

	public double getKeliling() {
		
		return (double) 4 * this.s;
	}

	public double getSisi() {
		return this.s;
	}
	
	public void setSisi(double s) {
		this.s = s;
	}

}

class Lingkaran {
	private double r;

	public Lingkaran(double r) {
		this.r = r;
	}

	public double getLuas() {
		return (double) Math.PI * (this.r * this.r);
	}

	public double getKeliling() {
		
		return (double) Math.PI * (this.r * 2);
	}

	public double getJariJari() {
		return this.r;
	}
	
	public void setJariJari(double r) {
		this.r = r;
	}

}

