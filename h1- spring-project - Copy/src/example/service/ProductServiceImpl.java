package example.service;



import java.util.List;

import example.model.Product;
import exmple.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
ProductRepository productRepository;


	public ProductServiceImpl() {
	
}

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> getProducts() {
	return productRepository.getProducts();
	}

}
