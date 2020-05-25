package app.book;

import java.io.Serializable;

public class FictionBook extends Books implements Serializable {
	private String category;

	public FictionBook() {
	}

	public FictionBook(String bockCode, String name, double price, String author, String category) {
		super(bockCode, name, price, author);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "FictionBook{" +
				"category='" + category + '\'' +
				"bockCode='" + getBockCode() + '\'' +
				", name='" + getName() + '\'' +
				", price=" + getPrice() +
				", author='" + getAuthor() + '\'' +
				'}';
	}
}
