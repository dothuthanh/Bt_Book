package app;

import app.book.Books;
import app.book.FictionBook;
import app.book.ProgrammingBook;
//import app.aplication.BookFileManagement;
import  app.aplication.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                // Create 5 ProgrammingBook
                ProgrammingBook javaProgrammingBook1 = new ProgrammingBook("C0320H1", "JavaPro Volume 1",100.000d, "RedT", "Java", "CodeGym");
                ProgrammingBook javaProgrammingBook2 = new ProgrammingBook("C0330H1", "JavaScript. pro",110.000d, "RedT", "JavaScript", "CodeGym");
                ProgrammingBook phpProgrammingBook = new ProgrammingBook("C0340H1",  "PHP All in 1",120.000d, "RedT", "Php", "CodeGym");
                ProgrammingBook javaProgrammingBook4 = new ProgrammingBook("C0350H1", "Java ALl in 1",130.000d, "RedT", "Java", "CodeGym");
                ProgrammingBook javascriptProgrammingBook   = new ProgrammingBook("C0360H1", "JavaScript All in 1", 140.000d, "RedT", "JavaScript", "CodeGym");

                List<Books> listProgrammingBook = new ArrayList<>();
                listProgrammingBook.add(javaProgrammingBook1);
                listProgrammingBook.add(javaProgrammingBook2);
                listProgrammingBook.add(phpProgrammingBook);
                listProgrammingBook.add(javaProgrammingBook4);
                listProgrammingBook.add(javascriptProgrammingBook);

                BookFileManagement management = new BookFileManagement();

                // ProgrammingBook File Book
                management.writeFileBook("ProgrammingBook.data", listProgrammingBook);

                List<Books> listTest = management.readFileBook("ProgrammingBook.data", listProgrammingBook);

                listTest.forEach((result)->{
                    ProgrammingBook a = (ProgrammingBook) result;
                    System.out.println(a);
                });
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // Create 5 FictionBook
                FictionBook fictionBook1 = new FictionBook("C0120H1", "The King",180.000d, "Fiction", "CodeGym");
                FictionBook fictionBook2 = new FictionBook("C0220H1", "Thanh Xuan",454.000d, "Fiction", "CodeGym");
                FictionBook fictionBook3 = new FictionBook("C0420H1", "Am Huong",132.000d, "Fiction", "CodeGym");
                FictionBook fictionBook4 = new FictionBook("C0520H1", "Ngon tinh",540.000d, "Fiction", "CodeGym");
                FictionBook fictionBook5   = new FictionBook("C0620H1", "Chuyen ma",119.000d, "Fiction", "CodeGym");

                List<Books> listFictionBook     = new ArrayList<>();
                listFictionBook.add(fictionBook1);
                listFictionBook.add(fictionBook2);
                listFictionBook.add(fictionBook3);
                listFictionBook.add(fictionBook4);
                listFictionBook.add(fictionBook5);

                BookFileManagement management = new BookFileManagement();

                // FictionBook File Book
                management.writeFileBook("FictionBook.data", listFictionBook);

                List<Books> listTestFictionBook = management.readFileBook("FictionBook.data", listFictionBook);

                listTestFictionBook.forEach((result) -> {
                    FictionBook temp = (FictionBook) result;
                    System.out.println(temp);
                });
            }
        }).start();
    }
}
