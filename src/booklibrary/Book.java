
package booklibrary;


public class Book 
{
   final private String title;
   final private String nameOfAuthor;
   final private String publication;
   final private int price;
    
    public Book(String title,String nameOfAuthor,String publication,int price)
    {
        this.title=title;
        this.publication=publication;
        this.price = price;
        this.nameOfAuthor=nameOfAuthor;
    }
    
    public String toString()
    {
        String detail = "Title :"+title+"\n"+"Name Of Author :"+ nameOfAuthor+"\n"+"Publication :" + publication +"\n"+ "Price :"+price+"\n";
        return detail;
    }
}
