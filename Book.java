/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Pipatporn Chaluthong
 * @version 2024.9.17
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    /**
     * 
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * 
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * 
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * 
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * 
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * 
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * 
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error..." + "Reference Number" 
            + " should have at least three or more characters"
            + "\n" + "Please set a new one");
        }
    }
    
    /**
     * 
     */
    public void printDetails()
    {
        String bookDetails = "Title: " + title 
        + ", Author: " + author 
        + ", Pages: " + pages;
        
        if(refNumber.length() > 0)
        {
            System.out.println(bookDetails 
            + ", Reference Number: " + refNumber);
        }
        else
        {
            System.out.println(bookDetails);
        }
    }
}
