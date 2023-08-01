package HomeWork12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookPublicationYear == book.bookPublicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookPublicationYear, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPublicationYear=" + bookPublicationYear +
                ", author=" + author +
                '}';
    }
}


