package exmple.repository;

import java.util.ArrayList;
import java.util.List;

import example.model.Product;

public class OracleDBRespository implements ProductRepository {
@Override
public List<Product> getProducts() {
	List<Product> products= new ArrayList<>();
			
	Product product = new Product();
	product.setProductid(101);
product.setProductname("Angular");
	
products.add(product);

	return products;
}
}
