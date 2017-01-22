package product.dto;

public class CategoryDownDTO {
	private int categoryDown_num;
	private int category_num;
	private String categoryDown_name;
	
	public CategoryDownDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCategoryDown_num() {
		return categoryDown_num;
	}

	public void setCategoryDown_num(int categoryDown_num) {
		this.categoryDown_num = categoryDown_num;
	}

	public int getCategory_num() {
		return category_num;
	}

	public void setCategory_num(int category_num) {
		this.category_num = category_num;
	}

	public String getCategoryDown_name() {
		return categoryDown_name;
	}

	public void setCategoryDown_name(String categoryDown_name) {
		this.categoryDown_name = categoryDown_name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoryDown [categoryDown_num=");
		builder.append(categoryDown_num);
		builder.append(", category_num=");
		builder.append(category_num);
		builder.append(", categoryDown_name=");
		builder.append(categoryDown_name);
		builder.append("]");
		return builder.toString();
	}
	
	
}
