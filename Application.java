package menumenu;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		// 메인 메뉴판 화면 메소드 호출
		showMainMenu();


		Action actionMenu = new Action();


		Scanner input = new Scanner(System.in);

		String inputStr;
		while (true) {
			inputStr = input.nextLine().trim().replace(".", "");

			switch (inputStr) {

			// 햄버거 상품 메뉴
			case "1":
				System.out.println();

				actionMenu.showBurgerMenu();
				break;
			// 아이스크림 상품 메뉴
			case "2":
				System.out.println();

				actionMenu.showIceCreamMenu();
				break;
			// 음료 상품 메뉴
			case "3":
				System.out.println();

				actionMenu.showDrinksMenu();
				break;
			// 맥주 상품 메뉴
			case "4":
				System.out.println();

				actionMenu.showBeerMenu();
				break;
			// 장바구니
			case "5":
				System.out.println();

				actionMenu.showOrderMenu();
				break;
			case "6":
				System.out.println();

				actionMenu.cancelMenu();
				break;
			default:
				printWrongAnswer();
				break;
			}

		}
	}


	// 기본 메뉴판, 메인 메뉴판 화면
	public static void showMainMenu() {


		Menu menu = new Menu();
		System.out.println("\"SHAKESHAKE BURGER 에 오신걸 환영합니다.\"");
		System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
		System.out.println();
		System.out.println("[ SHAKESHAKE MENU ]");
		menu.setName("Burgers");
		menu.setDescription("앵거스 비프 통살을 다져만든 버거");
		System.out.println("1. " + menu.getName() + "		| " + menu.getDescription());
		menu.setName("Frozen Custard");
		menu.setDescription("매장에서 신선하게 만드는 아이스크림");
		System.out.println("2. " + menu.getName() + "	| " + menu.getDescription());
		menu.setName("Drinks");
		menu.setDescription("매장에서 직접 만드는 음료");
		System.out.println("3. " + menu.getName() + "		| " + menu.getDescription());
		menu.setName("Beer");
		menu.setDescription("뉴욕 브루클린 브루어리에서 양조한 맥주");
		System.out.println("4. " + menu.getName() + "			| " + menu.getDescription());
		System.out.println();
		System.out.println("[ ORDER MENU ]");
		System.out.println("5. Order		| 장바구니를 확인 후 주문합니다.");
		System.out.println("6. Cancel		| 진행중인 주문을 취소합니다.");
	}



	public static void printWrongAnswer() {
		System.out.println("잘 못 입력하셨습니다.");
		System.out.println();
		showMainMenu();
	}

}