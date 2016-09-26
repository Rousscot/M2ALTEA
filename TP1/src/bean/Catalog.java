/**
 * 
 */
package bean;

import java.util.Calendar;
import java.util.HashMap;

/**
 * @author Cyril
 *
 */
public class Catalog {
	protected static Catalog catalog;
	protected String name;
	protected HashMap<String, Product> productList;

	public static Catalog getInstance() {

		if (catalog == null) {
			init();
		}
		return catalog;
	}

	private static void init() {
		Product produit1 = new Product();
		produit1.setId("P1");
		produit1.setName("PHILIPS 52PFL7203H");
		Price prix1 = new Price();
		prix1.setEuroPrice(1499.99f);
		prix1.setLivrePrice(1309.52f);
		produit1.setPrice(prix1);
		Product produit2 = new Product();
		produit2.setId("P2");
		produit2.setName("SAMSU_PS42A416");
		Price prix2 = new Price();
		prix2.setEuroPrice(589.99f);
		prix2.setLivrePrice(515.07f);
		produit2.setPrice(prix2);
		Calendar c = Calendar.getInstance();
		c.set(2011, 0, 25);
		produit2.setDisponibilityDate(c.getTime());
		produit2.setImage(
				"http://t3.gstatic.com/images?q=tbn:ANd9GcRFl5tec0RXso9SdJtEtOUZNhGSCMgwBaZVRapiPeKQ_x7PMA7NGA");
		produit2.setDescription(
				"Téléviseur Plasma 42\" (106 cm) 16:9 - Tuner TNT intégré - Double HDMI - Entrée PC - Résolution: 1024 x 768 - Luminosité: 1500 cd/m2 - Taux de contarste: 100 000:1 - Angle de vision: 175°");
		Product produit3 = new Product();
		produit3.setId("P3");
		produit3.setName("PHILIPS 52PFL7203H");
		produit3.setImage(
				"http://t1.gstatic.com/images?q=tbn:ANd9GcQiymzV76YAa3xX7YCJIccfNfhvp_az0XDvBfsSefIrmByazMZ_5A");
		Price prix3 = new Price();
		prix3.setEuroPrice(1499.99f);
		prix3.setLivrePrice(1309.52f);
		produit3.setPrice(prix3);
		Product produit4 = new Product();
		produit4.setId("P4");
		produit4.setName("TOSHIBA 32CV515DG");
		Price prix4 = new Price();
		prix4.setEuroPrice(499.99f);
		prix4.setLivrePrice(436.50f);
		produit4.setPrice(prix4);
		produit4.setDescription(
				"Téléviseur LCD 32\" (81 cm) 16:9 HD TV - Tuner TNT HD intégré - Triple HDMI - Résolution: 1366 x 768 - Luminosité: 500 cd/m2 - Contraste: 30000:1 - Temps de réponse: 8 ms - Angle de vision: 178°");
		HashMap<String, Product> listProduct = new HashMap<String, Product>();
		listProduct.put(produit1.getId(), produit1);
		listProduct.put(produit2.getId(), produit2);
		listProduct.put(produit3.getId(), produit3);
		listProduct.put(produit4.getId(), produit4);
		catalog = new Catalog();
		catalog.setName("Catalogue");
		catalog.setProductList(listProduct);
	}

	public static Catalog getCatalog() {
		return catalog;
	}

	public static void setCatalog(Catalog catalog) {
		Catalog.catalog = catalog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, Product> getProductList() {
		return productList;
	}

	public void setProductList(HashMap<String, Product> productList) {
		this.productList = productList;
	}
}
