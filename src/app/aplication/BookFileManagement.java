package app.aplication;

import app.book.Books;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class BookFileManagement {
    public List<Books> readFileBook(String path, List<Books> books){
        List<Books> list = new ArrayList<>();
        FileInputStream fileInputStream     = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream   = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Books book = null;
            while ((book = (Books) objectInputStream.readObject()) !=null){
                list.add(book);
            }
        } catch (IOException | ClassNotFoundException e) {
        }finally{
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    public void writeFileBook(String path, List<Books> books){
        FileOutputStream fileOutputStream     = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream   = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Books book: books){
                objectOutputStream.writeObject(book);
            }
        } catch (IOException e) {

        }finally{
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
