import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3 };

		Product product1 = new Product();
		product1.setName("Laptop");
		product1.setDescription("Bilgisayar");
		product1.setPrice(10000);

		Product product2 = new Product();
		product2.setName("Mouse");
		product2.setDescription("Bilgisayar Parçası");
		product2.setPrice(150);

		Product[] urunler = new Product[] { product1, product2 };
		for (Product product : urunler) {
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println("Price : " + product.getPrice());
			System.out.println();
		}

		for (int i = 0; i < urunler.length; i++) {
			System.out.println(urunler[i].getName());
		}

		System.out.println("\n ------CreditManager Bağlantılı Konu------ \n");

		// CreditManager creditManager = new CreditManager();
		// creditManager.calculate();
		// creditManager.add();

		// MortgageManager mortgageManager = new MortgageManager();
		// mortgageManager.add();
		// mortgageManager.calculate();

		// CreditManager[] credits=new CreditManager[] {new MortgageManager(),new
		// VehicleManager(),new OfficerCredit()};

		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new OfficerCredit());
		
		for (CreditManager creditManager : credits) {
			creditManager.calculate();
		}

		//for (int i = 0; i < credits.length; i++) {
		//	credits[i].calculate();
		//}

	}
}
