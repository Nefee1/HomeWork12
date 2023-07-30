package HomeWork12;

public class Main {
    public static void main(String[] args) {
        Author stiven = new Author("Cтивен", "Кинг");
        Author berd = new Author("Oven", "berd");

        Book king = new Book("It", stiven ,1956);
        System.out.println("Имя книги " + king.getBookName());
        System.out.println("Имя книги " + king.getBookPublicationYear());
        king.setBookPublicationYear(1957);
        System.out.println("Имя книги " + king.getBookPublicationYear());

        System.out.println();

        Book stiven2 = new Book("shine", berd,  1858);
        System.out.println("Имя книги " + stiven2.getBookName());
        System.out.println("Имя книги " + stiven2.getBookPublicationYear());
        stiven2.setBookPublicationYear(1850);
        System.out.println("Имя книги " + stiven2.getBookPublicationYear());

        System.out.println();

        Author name = new Author("King", "stiven2");
        System.out.println("Имя афтора " + name.getAuthorName());
        System.out.println("Фамилия афтора " + name.getsurnameAuthor());

        System.out.println();

        Author name2 = new Author("Anna", "Backer");
        System.out.println("Имя афтора " + name2.getAuthorName());
        System.out.println("Фамилия афтора " + name2.getsurnameAuthor());

    }
}
