package app.aplication;

import app.book.Books;
import app.book.ProgrammingBook;

import java.util.Arrays;

public class Aplication {

	// Tính tổng giá các quấn sách
	public double getTotalPriceBooks(Books[] books){
		double total = 0.0d;
		for (int i = 0; i< books.length; i++){
			double price = books[i].getPrice();
			total += price;
		}
		return total;
	}

	// Đếm tổng các quấn sách là ProgrammingBok
	public int countProgrammingBook(Books[] books){
		int count = 0;
		for (int i = 0; i< books.length; i++){
			Books book = books[i];
			if (book instanceof ProgrammingBook){
				ProgrammingBook programmingBook = (ProgrammingBook) book;
				if (programmingBook.getLanguage().equals("Java")){
					count++;
				}
			}
		}
		return count;
	}

	// Tìm sách theo tên
	public Books getBookByName(Books[] books, String name){
		for (int i = 0; i< books.length; i++){
			Books book = books[i];
			if (book.getName().equals(name)){
				return book;
			}
		}
		return null;
	}

	/**
	 * Sắp sếp sủi bọt theo giá (integer)
	 * bubblesSortByPrice()
	 * @param books
	 */
	public void bubblesSortByPrice(Books[] books){
		int eachTo = books.length-1;
		for(int i = 0; i < eachTo; i++){
			Books bookFirst = books[i];
			Books bookNext  = books[i+1];
			if (bookFirst.getPrice() > bookNext.getPrice()){
				books[i]   = bookNext;
				books[i+1] = bookFirst;
			}
		}
	}

	/**
	 * Sắp sếp chèn theo giá (integer)
	 * insertSortByPrice()
	 * @param books
	 */
	public void insertSortByPrice(Books[] books){
		for(int i = 0; i < books.length; i++){
			for(int j = i; j > 0; j--){
				Books bookFirst = books[j];
				Books bookNext  = books[j-1];
				if (bookFirst.getPrice() < bookNext.getPrice()){
					books[j] = bookNext;
					books[j-1] = bookFirst;
				}
			}
		}
	}

	/**
	 * Sắp sếp chọn theo giá (integer)
	 * selectSortByPrice()
	 * @param books
	 */
	public void selectSortByPrice(Books[] books){
		for(int i = 0; i < books.length; i++){
			Books book = books[i];
			int index = -1;
			for(int j = i; j < books.length; j++){
				if (book.getPrice() > books[j].getPrice()){
					book  = books[j];
					index = j;
				}
			}
			if (index != -1){
				books[index] = books[i];
				books[i]     = book;
			}
		}
	}


	/**
	 * Tìm kiếm nhị phân theo tên
	 * binarySearchByName()
	 * @param books
	 * @param name
	 */
	public Books binarySearchByName(Books[] books, String name){
		int startPoint = 0;
		int endPoint   = books.length - 1;
		while (startPoint <= endPoint) {
			int m = startPoint + (endPoint - startPoint) / 2;

			int res = name.compareTo(books[m].getName());

			if (res == 0)
				return books[m];

			if (res > 0)
				startPoint = m + 1;
			else
				endPoint = m - 1;
		}
		return null;
	}


	/**
	 * Hiển thị thông tin mảng
	 * showBooks()
	 * @param books
	 */
	public void showBooks(Books[] books){
		for(int i = 0; i < books.length; i++){
			System.out.println(books[i].getName() + " - " + books[i].getPrice());
		}
	}
}
