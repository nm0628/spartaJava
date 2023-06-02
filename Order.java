package menumenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
	Scanner thirdInput = new Scanner(System.in);


	private List<Product> productList = new ArrayList<Product>();

	private List<Product> sellProductList = new ArrayList<>();


	public void addProduct(Product product) {
		System.out.println();
		System.out.println(product.getName() + "	| ₩ " + product.getPrice() + " | " + product.getDescription());
		System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
		System.out.println("1. 확인	2. 취소");
		String inputStr = thirdInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			if (productList.contains(product)) {
				product.setCount(product.getCount() + 1);
			} else {
				productList.add(product);
			}
			sellProductList.add(product);
			System.out.println(product.getName() + " 가 장바구니에 추가되었습니다.");
			System.out.println();
			Application.showMainMenu();
			break;
		case "2":
			System.out.println();
			Application.showMainMenu();
			break;
		default:
			Application.printWrongAnswer();
			break;
		}
	}

	public void resetProductList() {
		productList = new ArrayList<Product>();
	}



	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}





	public List<Product> getSellProductList() {
		return sellProductList;
	}

}
