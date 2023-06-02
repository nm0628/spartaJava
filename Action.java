package menumenu;

import java.util.List;
import java.util.Scanner;

public class Action {

	Scanner secondInput = new Scanner(System.in);
	Order order = new Order();
	// 버거 메뉴
	Product shackBurger = new Product("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
	Product smokeBurger = new Product("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
	Product shroomBurger = new Product("ShroomBurger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
	Product cheeseburger = new Product("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
	Product hamburger = new Product("ShackBurger", 5.4, "비프 패티를 기반으로 야채가 들어간 기본버거");

	// 아이스크림 메뉴
	Product shakes = new Product("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피");
	Product shakeOfTheWeek = new Product("Shake of the Week", 6.5, "특별한 커스터드 플레이버");
	Product redBeanShake = new Product("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
	Product floats = new Product("Floats", 5.9, "루트 비어, 퍼플 카우, 크림시클");

	// 음료 메뉴
	Product lemonade = new Product("Shake-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드");
	Product icedTea = new Product("Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티");
	Product fiftyFifty = new Product("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남");
	Product soda = new Product("Fountain Soda", 3.7, "코카콜라, 코카콜라, 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
	Product rootBeer = new Product("Abita Root Beer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료");
	Product water = new Product("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수");

	// 맥주 메뉴
	Product aleBeer = new Product("ShakeShake Ale", 5.5, "뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
	Product lagerBeer = new Product("Lager Beer", 6.3, "시원하고 탄산이 있어 청량감 있는 라거 맥주");
	Product gooseBeer = new Product("Goose Beer", 7.0, "풍부한 거품과 부드러운 구스아일랜드 맥주");



	private int serialNum = 0;
	private float totalSellCost = 0.0f;


	private void introPrint() {
		System.out.println("\"SHAKESHAKE BURGER 에 오신걸 환영합니다.\"");
		System.out.println("아래 상품 메뉴판을 보시고 상품을 골라 입력해주세요.");
		System.out.println();
	}

	public void showBurgerMenu() {
		introPrint();
		System.out.println("[ Burgers MENU ]");
		System.out.println("1. " + shackBurger.getName() + "	| ₩ " + shackBurger.getPrice() + " | "
				+ shackBurger.getDescription());
		System.out.println("2. " + smokeBurger.getName() + "	| ₩ " + smokeBurger.getPrice() + " | "
				+ smokeBurger.getDescription());
		System.out.println("3. " + shroomBurger.getName() + "	| ₩ " + shroomBurger.getPrice() + " | "
				+ shroomBurger.getDescription());
		System.out.println("4. " + cheeseburger.getName() + "	| ₩ " + cheeseburger.getPrice() + " | "
				+ cheeseburger.getDescription());
		System.out.println(
				"5. " + hamburger.getName() + "	| ₩ " + hamburger.getPrice() + " | " + hamburger.getDescription());

		String inputStr = secondInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			order.addProduct(shackBurger);
			break;
		case "2":
			order.addProduct(smokeBurger);
			break;
		case "3":
			order.addProduct(shroomBurger);
			break;
		case "4":
			order.addProduct(cheeseburger);
			break;
		case "5":
			order.addProduct(hamburger);
			break;
		default:
			menumenu.Application.printWrongAnswer();
			break;
		}
	}

	public void showIceCreamMenu() {
		introPrint();

		System.out.println("[ Frozen Custard MENU ]");
		System.out.println(
				"1. " + shakes.getName() + "		| ₩ " + shakes.getPrice() + " | " + shakes.getDescription());
		System.out.println("2. " + shakeOfTheWeek.getName() + "	| ₩ " + shakeOfTheWeek.getPrice() + " | "
				+ shakeOfTheWeek.getDescription());
		System.out.println("3. " + redBeanShake.getName() + "	| ₩ " + redBeanShake.getPrice() + " | "
				+ redBeanShake.getDescription());
		System.out.println(
				"4. " + floats.getName() + "		| ₩ " + floats.getPrice() + " | " + floats.getDescription());

		String inputStr = secondInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			order.addProduct(shakes);
			break;
		case "2":
			order.addProduct(shakeOfTheWeek);
			break;
		case "3":
			order.addProduct(redBeanShake);
			break;
		case "4":
			order.addProduct(floats);
			break;
		default:
			menumenu.Application.printWrongAnswer();
			break;
		}
	}

	public void showDrinksMenu() {
		introPrint();

		System.out.println("[ Drinks MENU ]");
		System.out.println(
				"1. " + lemonade.getName() + "	| ₩ " + lemonade.getPrice() + " | " + lemonade.getDescription());
		System.out
				.println("2. " + icedTea.getName() + "	| ₩ " + icedTea.getPrice() + " | " + icedTea.getDescription());
		System.out.println("3. " + fiftyFifty.getName() + "		| ₩ " + fiftyFifty.getPrice() + " | "
				+ fiftyFifty.getDescription());
		System.out.println("4. " + soda.getName() + "	| ₩ " + soda.getPrice() + " | " + soda.getDescription());
		System.out.println(
				"5. " + rootBeer.getName() + "	| ₩ " + rootBeer.getPrice() + " | " + rootBeer.getDescription());
		System.out.println("6. " + water.getName() + "	| ₩ " + water.getPrice() + " | " + water.getDescription());

		String inputStr = secondInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			order.addProduct(lemonade);
			break;
		case "2":
			order.addProduct(icedTea);
			break;
		case "3":
			order.addProduct(fiftyFifty);
			break;
		case "4":
			order.addProduct(soda);
			break;
		case "5":
			order.addProduct(rootBeer);
			break;
		case "6":
			order.addProduct(water);
			break;
		default:
			menumenu.Application.printWrongAnswer();
			break;
		}
	}

	public void showBeerMenu() {
		introPrint();

		System.out.println("[ Beer MENU ]");
		System.out
				.println("1. " + aleBeer.getName() + "	| ₩ " + aleBeer.getPrice() + " | " + aleBeer.getDescription());
		System.out.println(
				"2. " + lagerBeer.getName() + "		| ₩ " + lagerBeer.getPrice() + " | " + lagerBeer.getDescription());
		System.out.println(
				"3. " + gooseBeer.getName() + "		| ₩ " + gooseBeer.getPrice() + " | " + gooseBeer.getDescription());

		String inputStr = secondInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			order.addProduct(aleBeer);
			break;
		case "2":
			order.addProduct(lagerBeer);
			break;
		case "3":
			order.addProduct(gooseBeer);
			break;
		default:
			menumenu.Application.printWrongAnswer();
			break;
		}
	}
	// 주문내역보여주고 주문 ~~ 주문금액을 표현해주는 변수필요... totalOrderCost ....
	//
	public void showOrderMenu() {
		float totalOrderCost = 0.0f;
		List<Product> orderList = order.getProductList();
		System.out.println("아래와 같이 주문 하시겠습니까?");
		System.out.println();
		System.out.println("[ Orders ] ");
		for (Product product : orderList) {
			if (product.getName().length() > 16) {
//				System.out.println(product.getName() + " , " + product.getName().length());
				System.out.println(product.getName() + "	| ₩ " + product.getPrice() + " | " + product.getCount()
						+ " 개" + " | " + product.getDescription());
			} else if (product.getName().length() < 7) {
				System.out.println(product.getName() + "			| ₩ " + product.getPrice() + " | " + product.getCount()
				+ " 개" + " | " + product.getDescription());
			} else{
				System.out.println(product.getName() + "		| ₩ " + product.getPrice() + " | " + product.getCount()
						+ " 개" + " | " + product.getDescription());
			}
			totalOrderCost += product.getPrice();
		}
		if (0.0 == totalOrderCost) {
			System.out.println("상품을 장바구니에 담은 후 다시 주문 해주세요.");
			returnMenuAfter3s();
			return;
		}
		System.out.println();
		System.out.println("[ Total ] ");
		System.out.println("₩ " + totalCostFormatter(totalOrderCost));
		System.out.println();
		System.out.println("1. 주문	2. 메뉴판");

		String inputStr = secondInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			serialNum++;
			totalSellCost += totalOrderCost;
			resetOrderData();
			System.out.println("주문이 완료되었습니다!");
			System.out.println();
			System.out.println("대기번호는 [ " + serialNum + " ] 번 입니다.");
			returnMenuAfter3s();
			break;
		case "2":
			System.out.println();
			menumenu.Application.showMainMenu();
			break;
		default:
			menumenu.Application.printWrongAnswer();
			break;
		}
	}

	private void returnMenuAfter3s() {
		System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
		try {
			Thread.sleep(3000);
			System.out.println();
			menumenu.Application.showMainMenu();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void cancelMenu() {
		System.out.println("진행하던 주문을 취소하시겠습니까?");
		System.out.println("1. 확인	2. 취소");
		String inputStr = secondInput.nextLine().trim().replace(".", "");

		switch (inputStr) {
		case "1":
			System.out.println("진행하던 주문이 취소되었습니다.");
			System.out.println();
			resetOrderData();

			menumenu.Application.showMainMenu();
			break;
		case "2":
			System.out.println();
			menumenu.Application.showMainMenu();
			break;
		default:
			menumenu.Application.printWrongAnswer();
			break;
		}
	}
	private void resetOrderData() {
		order.resetProductList();
	}


	private String totalCostFormatter(float totalCost) {
		return String.format("%.1f", totalCost);
	}

}


