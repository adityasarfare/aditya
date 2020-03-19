package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.service.ProductService;
import exmple.repository.ProductRepository;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("ApplicationContext.xml");
		seeDIinaction(applicationContext);
		seeIOCinAction(applicationContext);
	}
private static void seeDIinaction(ApplicationContext applicationContext) {
	ProductService productService;
	productService= applicationContext.getBean("productService", ProductService.class);
	
	productService.getProducts().forEach(System.out::println);
}	
      private static void seeIOCinAction(ApplicationContext applicationContext) {
 ProductRepository productRepository;
 productRepository = applicationContext.getBean("productRepository", ProductRepository.class);
 productRepository.getProducts().forEach(System.out::println);
	
}
}