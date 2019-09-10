package sec03.exam05;

public class Product {
	
	int pNum;
	String pName;
	int pStock;
	int pPrice;
	String pCompany;
	
	Product(){
		
	}
	
	Product(int pNum, String pName, int pStock, int pPrice){
		this(pNum, pName, pStock, pPrice, null);
	}
	
	Product(int pNum, String pName, int pStock, int pPrice, String pCompany){
		this.pNum = pNum;
		this.pName = pName;
		this.pStock = pStock;
		this.pPrice = pPrice;
		this.pCompany = pCompany;
	}
	
	Product(int pNum, char[] pName, int pStock, int pPrice, String pCompany){
		this(pNum, new String(pName), pStock, pPrice, pCompany);
	}
	
	Product(int pNum, char[] pName, int pStock, int pPrice, char[] pCompany){
		this(pNum, new String(pName), pStock, pPrice, new String(pCompany));
	}
	
}
