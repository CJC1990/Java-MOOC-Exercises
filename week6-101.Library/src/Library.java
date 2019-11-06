
import java.util.ArrayList;

public class Library {
    
    // ---CLASS VARIABLES---
    private ArrayList<Book> books;
    
    // ---CONSTRUCTOR---
    public Library() {
        books = new ArrayList<Book>();
    }
    
    // ---METHODS---
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    
    public void printBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> newList = new ArrayList<Book>();
        for (Book book : books) {
            if(StringUtils.included(book.title(), title)){
                newList.add(book);
            }
        }
        return newList;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> newList = new ArrayList<Book>();
        for (Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)){
                newList.add(book);
            }
        }
        return newList;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> newList = new ArrayList<Book>();
        for (Book book : books) {
            if(book.year() == year){
                newList.add(book);
            }
        }
        return newList;
    }
}
