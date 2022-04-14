
package booklibrary;

import java.util.ArrayList;


public class BookLibrary {

   
    public static void main(String[] args) 
    {
        BookService libraryService = new BookService();
        
        libraryService.addBook("Harry Potter","J.K.R" ,"Bloomsbury Publishing",250);
        libraryService.addBook("The Kite Runner "," Khaled Hosseini" ,"Bloomsbury Publishing",360);
        
        
       
         ArrayList<Book>books = libraryService.getBooks();
         
         for(Book book:books)
         {
             // System.out.println(book.toString());
             System.out.println(book);
         }
        
    }
    
}
