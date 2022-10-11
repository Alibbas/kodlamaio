package kodlamaIO.entities;

public class Course {
	private String educator;
	private String category;
	private String title;
	private int price;
	private String image;

	public Course(String educator, String category, String title, int price, String image) {
		this.educator = educator;
		this.category = category;
		this.title = title;
		this.price = price;
		this.image = image;
	}

	public String getEducator() {
		return educator;
	}

	public void setEducator(String educator) {
		this.educator = educator;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

}
