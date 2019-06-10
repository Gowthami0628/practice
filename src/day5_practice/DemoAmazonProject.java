package day5_practice;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject AP = new AmazonProject();
		AP.invokeBrowser();
		AP.searchProduct("Apple watch", "Electronics");
		String productinfo = AP.getNthProduct(10);
		System.out.println(productinfo);
		AP.getAllProducts();
		AP.getAllProductsViaScrolldownUsingJavaSript();

	}

}
