package workShop1;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int aranacak = 30;

		boolean varMi = sayiBul(sayilar, aranacak);

		mesajVer(varMi, aranacak);
	}

	public static void mesajVer(boolean varMi, int aranacak) {
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi mevcuttur : " + aranacak;
			System.out.println(mesaj);
		} else {
			mesaj = "Sayı mevcut değildir : " + aranacak;
			System.out.println(mesaj);
		}
	}

	public static boolean sayiBul(int[] sayilar, int aranacak) {
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		return varMi;

	}
}

//Bir fonksiyon yaz
//İki parametre alsın.  P1: dizi  P2: 30
//3 sayısı dizide yoktur
