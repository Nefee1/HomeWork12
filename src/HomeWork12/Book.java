package HomeWork12;

public class Book {
    private String bookName;
    private int bookPublicationYear;
    public Book (String bookName, int bookPublicationYear) {
        this.bookName = bookName;
        this.bookPublicationYear = bookPublicationYear;

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
}
class Author {
    private String authorName;
    private String surnameAuthor;

    public Author (String authorName, String surnameAuthor) {
        this.authorName = authorName;
        this.surnameAuthor = surnameAuthor;

    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getsurnameAuthor() {
        return this.surnameAuthor;
    }
}

