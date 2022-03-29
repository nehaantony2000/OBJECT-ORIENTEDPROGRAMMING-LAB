public class Product{
	
	String pcode, pname;
	double price;
	
	public void details(){
		System.out.println("The product name is : "+pname);
		System.out.println("The product code is : "+pcode);
		System.out.println("The product price is : "+price);
		System.out.println("\n");
	}
	
	public static void main(String[] args){
		
		Product p1= new Product();
		p1.pcode= "P1001";
		p1.pname= "pen";
		p1.price= 20;
		p1.details();
		
		Product p2= new Product();
		p2.pcode= "P1002";
		p2.pname= "Papper";
		p2.price= 60;
		p2.details();
		
		Product p3= new Product();
		p3.pcode= "P1003";
		p3.pname= "BOOK";
		p3.price= 100;
		p3.details();
		
		
		System.out.println("\n");
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p1.details();
		}
		else if(p2.price < p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p2.details();
		}
		else{
			System.out.println("\n\nProduct with lowest price is :");
			p3.details();
		}
	}
}