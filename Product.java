package menumenu;

public class Product extends Menu{

	// 가격 price , count 필드 생성
	private double price;
	private int count;


	// Product 생성자 선언
	public Product(String name, double price, String description) {
		this.setName(name);
		this.setDescription(description);
		this.price = price;
		this.count = 1;
	}

	// getter setter 구현
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
