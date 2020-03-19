package example.model;

public class Product {

	private int productid;
	private String productname;
	public Product() {
		
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + "]";
	}
	
	
}
