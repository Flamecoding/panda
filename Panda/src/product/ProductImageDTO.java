package product.dto;

public class ProductImageDTO {
	private int file_num;
	private int product_num;
	private String origin_name;
	private String file_name;
	public ProductImageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFile_num() {
		return file_num;
	}
	public void setFile_num(int file_num) {
		this.file_num = file_num;
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public String getOrigin_name() {
		return origin_name;
	}
	public void setOrigin_name(String origin_name) {
		this.origin_name = origin_name;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductImage [file_num=");
		builder.append(file_num);
		builder.append(", product_num=");
		builder.append(product_num);
		builder.append(", origin_name=");
		builder.append(origin_name);
		builder.append(", file_name=");
		builder.append(file_name);
		builder.append("]");
		return builder.toString();
	}
	
}
