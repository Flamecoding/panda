package product.dto;

public class CategoryDTO {
	private int category_num;
	private String category_name;
	
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCategory_num() {
		return category_num;
	}
	public void setCategory_num(int category_num) {
		this.category_num = category_num;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [category_num=");
		builder.append(category_num);
		builder.append(", category_name=");
		builder.append(category_name);
		builder.append("]");
		return builder.toString();
	}
	
}
