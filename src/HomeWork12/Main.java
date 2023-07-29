package HomeWork12;

public class Main {
    public static void main(String[] args) {
        Book king = new Book("It", 1956);
        System.out.println("Имя книги " + king.getBookName());
        System.out.println("Имя книги " + king.getBookPublicationYear());
        king.setBookPublicationYear(1957);
        System.out.println("Имя книги " + king.getBookPublicationYear());

        System.out.println();

        Book stiven = new Book("shine", 1858);
        stiven.setBookPublicationYear(1850);
        System.out.println("Имя книги " + stiven.getBookName());
        System.out.println("Имя книги " + stiven.getBookPublicationYear());

        System.out.println();

        Author name = new Author("King", "stiven");
        System.out.println("Имя афтора " + name.getAuthorName());
        System.out.println("Фамилия афтора " + name.getsurnameAuthor());

        System.out.println();

        Author name2 = new Author("Anna", "Backer");
        System.out.println("Имя афтора " + name2.getAuthorName());
        System.out.println("Фамилия афтора " + name2.getsurnameAuthor());

    }
}
