package product.dto;

public class ProductDTO {
	private int product_num;
	private int categoryDown_num;
	private String product_name;
	private int product_price;
	private String product_content;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public int getCategoryDown_num() {
		return categoryDown_num;
	}
	public void setCategoryDown_num(int categoryDown_num) {
		this.categoryDown_num = categoryDown_num;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_content() {
		return product_content;
	}
	public void setProduct_content(String product_content) {
		this.product_content = product_content;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [product_num=");
		builder.append(product_num);
		builder.append(", categoryDown_num=");
		builder.append(categoryDown_num);
		builder.append(", product_name=");
		builder.append(product_name);
		builder.append(", product_price=");
		builder.append(product_price);
		builder.append(", product_content=");
		builder.append(product_content);
		builder.append("]");
		return builder.toString();
	}
	
	
}
