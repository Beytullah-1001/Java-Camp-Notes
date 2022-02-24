package oopIntro;

public class main {

	public static void main(String[] args) {
		//Product1 object initialized with ctor
		ProductManager productManager=new ProductManager();
		
		
		
		//Product2 object
		Product product2=new Product();
		product2.setId(2);
		product2.setName("HP");
		product2.setUnitPrice(200);
		product2.setDetail("8 gb ram");
		product2.setDiscount(30);
		

		//Product3 object
		Product product3=new Product();
		product3.setId(3);
		product3.setName("Monster");
		product3.setUnitPrice(600);
		product3.setDetail("32 gb ram");
		Product[] products = {
				
				product2,
				product3
		};
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		//Category1 object
		Category category1=new Category();
		category1.id=1;
		category1.name="Technology";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Home/Garden";
		System.out.println(products.length);
		for(Product product:products) {
			System.out.println(product.getName());
			productManager.addToCart(product);
		}
		Category[] categories= {
			category1,category2	
		};
		for(Category category:categories) {
			System.out.println(category.name);
			
		}
		
	}

}
