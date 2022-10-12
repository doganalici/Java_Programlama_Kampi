package diziler;

public class Main {

	public static void main(String[] args) {
		String[] sehirler = new String[] { "Ankara", "İstanbul", "İzmir" };

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println(sehirler[i]);
		}

		String[] sehirler1 = new String[] { "Ankara", "İstanbul", "İzmir" };

		String[] sehirler2 = new String[] { "Antep", "Diyarbakır", "Urfa" };

		sehirler1 = sehirler2;
		sehirler1[0] = "Adana";
		System.out.println(sehirler2[0]);

		// sehirler1=new String[4];
		// sehirler1[3]="Bursa";
		// System.out.println(sehirler1[1]);

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;
		System.out.println(sayi1);
	}

}
