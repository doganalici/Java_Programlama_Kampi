package sartBlokları;

public class Main {

	public static void main(String[] args) {
		int not=50;
		//50 ve üzeri : geçti
		//40-49 : bütünleme
		//0-39 : kaldı
		if (not>=50) {
			System.out.println("Geçti");
		}
		else if (not>=40 && not<50) {
			System.out.println("Bütünleme");
		}
		else {
			System.out.println("Kaldı");
		}

	}

}
