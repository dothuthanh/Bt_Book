package app.book;

import java.io.Serializable;

public class ProgrammingBook extends Books implements Serializable {
	private String language;
	private String framework;

	public ProgrammingBook() {
	}

	public ProgrammingBook(String bockCode, String name, double price, String author, String language, String framework) {
		super(bockCode, name, price, author);
		this.language  = language;
		this.framework = framework;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "ProgrammingBook{" +
				"language='" + language + '\'' +
				", framework='" + framework + '\'' +
				"bockCode='" + getBockCode() + '\'' +
				", name='" + getName() + '\'' +
				", price=" + getPrice() +
				", author='" + getAuthor() + '\'' +
				'}';
	}
}
