package metotlar;

public class Main {

	public static void main(String[] args) {
		mesajVer("Engin");
		hesapla();

		System.out.println(topla(6, 3));

		System.out.println(toplananIkiSayininYuzdeOnu(10,90));
		
		System.out.println(krediHesapla(0));
	}

	public static void mesajVer(String isim) {
		System.out.println("Merhaba " + isim);
	}

	public static void hesapla() {
		System.out.println("Hesaplandı");
	}

	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2);
		double sonuc = toplam * 10 / 100;
		return sonuc;
	}

	public static double krediHesapla(double krediMiktari) {
		// hesaplar yapılır
		return 125000;
	}
}
