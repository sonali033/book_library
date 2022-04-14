

package booklibrary;

import java.util.*;


public class BookService 
{
    private BookRepository repository;
    
   public BookService()
   {
       repository = new BookRepository();
   }
    public void addBook(String title,String nameOfAuthor,String publication,int price)
    {
        if(title.isBlank() ||  nameOfAuthor.isBlank() || publication.isBlank() || price <=0)
        {
            throw new IllegalArgumentException("Invalid Arguments");
        }
        Book book = new Book(title,nameOfAuthor,publication,price);
        repository.addBook(book);
        
    }
    public ArrayList<Book>getBooks()
    {
        return repository.getBooks();
    }
}
