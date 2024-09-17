/**
 * This class receives and maintains information
 * about the book. It acts like a library system
 * that will record and display whatever infor-
 * mation the user asks for.
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
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, 
    int bookPages, boolean courseBook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = courseText;
    }

    /**
     * @Return the author name.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * @Return the book title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @Return the pages number of the book.
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Display the author name.
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * Display the book title.
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * @Return the book' reference number.
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * @Return how many the book have been borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Count how many the book have been borrowed.
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * Set the book' reference number.
     * if the reference number entered is less than
     * three, print an error message. 
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
     * @Return the courseText.
     * Checking whether the book is a course textbook or not.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Display all the book details.
     * Checking whether the book has a reference number or not.
     * If there is, will display with the book details.
     * However, if there isn't, will only display the book's detail
     * that have been entered.
     */
    public void printDetails()
    {
        String bookDetails = "Title: " + title 
        + ", Author: " + author 
        + ", Pages: " + pages
        + ", Borrowed: " + borrowed;
        
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
