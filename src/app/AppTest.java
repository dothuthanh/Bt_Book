package app;

import app.aplication.Aplication;
import app.book.Books;
import app.book.FictionBook;
import app.book.ProgrammingBook;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class AppTest {
	public static void main(String[] args) {
		lauch();
	}
	public static void lauch(){
		Aplication aplication = new Aplication();

		ProgrammingBook javaProgrammingBook1 = new ProgrammingBook("C0320H1", "JavaPro Volume 1",100.000d, "RedT", "Java", "CodeGym");
		ProgrammingBook javaProgrammingBook2 = new ProgrammingBook("C0330H1", "JavaScript. pro",110.000d, "RedT", "JavaScript", "CodeGym");
		ProgrammingBook phpProgrammingBook = new ProgrammingBook("C0340H1",  "PHP All in 1",120.000d, "RedT", "Php", "CodeGym");
		ProgrammingBook javaProgrammingBook4 = new ProgrammingBook("C0350H1", "Java ALl in 1",130.000d, "RedT", "Java", "CodeGym");
		ProgrammingBook javascriptProgrammingBook   = new ProgrammingBook("C0360H1", "JavaScript All in 1", 140.000d, "RedT", "JavaScript", "CodeGym");

		// Create 5 FictionBook
		FictionBook fictionBook1 = new FictionBook("C0120H1", "The King",180.000d, "Fiction", "CodeGym");
		FictionBook fictionBook2 = new FictionBook("C0220H1", "Thanh Xuan",454.000d, "Fiction", "CodeGym");
		FictionBook fictionBook3 = new FictionBook("C0420H1", "Am Huong",132.000d, "Fiction", "CodeGym");
		FictionBook fictionBook4 = new FictionBook("C0520H1", "Ngon tinh",540.000d, "Fiction", "CodeGym");
		FictionBook fictionBook5   = new FictionBook("C0620H1", "Chuyen ma",119.000d, "Fiction", "CodeGym");

		// list of 10 books
		Books[] books = new Books[]{javaProgrammingBook1, javaProgrammingBook2, phpProgrammingBook, javaProgrammingBook4, javascriptProgrammingBook, fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5};

		// tong tien cac quyen sach
		getTotalPrice(books, aplication);

		// So sach co ngon ngu la java
		countProgrammingBook(books, aplication);

		// tim ten va hien gia
		findNameAndViewPrice(books, aplication);

		// Sắp sếp nổi bọt
		//helpers.bubblesSortByPrice(books);

		// Sắp sếp chèn
		//helpers.insertSortByPrice(books);

		// Sắp sếp chọn
		//helpers.selectSortByPrice(books);

		// Tìm tên nhị phân
		binarySearchByName(books, aplication);
	}
	//tong gia
	public static void getTotalPrice(Books[] books, Aplication aplication){
		double totalPrice = aplication.getTotalPriceBooks(books);
		System.out.println("Tổng giá " + books.length + " cuốn sách là: " + totalPrice);
	}
	//sach co ten java
	public static void countProgrammingBook(Books[] books, Aplication aplication){
		int countJavaBook = aplication.countProgrammingBook(books);
		System.out.println("Số sách ProgrammingBook có language là Java: " + countJavaBook);
	}

	public static void findNameAndViewPrice(Books[] books, Aplication aplication){
		System.out.print("Nhập tên sách để tìm giá (tìm tuần tự): ");

		Scanner scanner = new Scanner(System.in);
		String name     = scanner.nextLine();
		Books result    = aplication.getBookByName(books, name);
		if (result == null){
			System.out.println("Không tìm thấy sách có tên: " + name);
		}else{
			System.out.println("Sách tên " + name + " có giá là: " + result.getPrice());
		}
	}

	// Tìm tên nhị phân
	public static void binarySearchByName(Books[] books, Aplication aplication){
		System.out.print("Nhập tên sách để tìm giá (tìm nhị phân): ");

		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(System.in);
		String name2     = scanner.nextLine();
		Books result2    = aplication.binarySearchByName(books, name2);
		if (result2 == null){
			System.out.println("Không tìm thấy sách có tên: " + name2);
		}else{
			System.out.println("Sách tên " + name2 + " có giá là: " + result2.getPrice());
		}
	}
}
