package sec03.exam05;

public class ProductExample {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product(1, "상품명1", 10/*재고*/, 10000/*가격*/);
		Product p3 = new Product(2, "상품명2", 20/*재고*/, 20000/*가격*/, "한화"/*제조사명*/);
		Product p4 = new Product(3, new char[] {'상', '품', '명', '3'}, 30/*재고*/, 30000/*가격*/, "한화"/*제조사명*/);
		Product p5 = new Product(4, new char[] {'상', '품', '명', '4'}, 30/*재고*/, 30000/*가격*/, new char[] {'한', '화'}/*제조사명*/);
		
		System.out.println(p1.pNum + " " + p1.pName + " " + p1.pStock + " " + p1.pPrice + " " + p1.pCompany);
		System.out.println(p2.pNum + " " + p2.pName + " " + p2.pStock + " " + p2.pPrice + " " + p2.pCompany);
		System.out.println(p3.pNum + " " + p3.pName + " " + p3.pStock + " " + p3.pPrice + " " + p3.pCompany);
		System.out.println(p4.pNum + " " + p4.pName + " " + p4.pStock + " " + p4.pPrice + " " + p4.pCompany);
		System.out.println(p5.pNum + " " + p5.pName + " " + p5.pStock + " " + p5.pPrice + " " + p5.pCompany);

	}

}
