
package booklibrary;

import java.util.*;


public class BookRepository 
{
    private ArrayList<Book>books;
    
    public BookRepository() 
    {
        books = new ArrayList<>(); 
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    
    public ArrayList<Book>getBooks()
    {
        return books;
    }
}
