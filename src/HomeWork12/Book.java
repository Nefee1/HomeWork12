package HomeWork12;

public class Book {
    private String bookName;
    private int bookPublicationYear;
    private Author author;
    public Book (String bookName, Author author,int bookPublicationYear) {
        this.bookName = bookName;
        this.bookPublicationYear = bookPublicationYear;
        this.author = author;
    }
    public String getBookName() {
        return this.bookName;
    }

    public int getBookPublicationYear() {
        return this.bookPublicationYear;
    }

   public void setBookPublicationYear(int bookPublicationYear) {
       this.bookPublicationYear = bookPublicationYear;
   }

    public Author getAuthor() {
        return author;
    }
}


