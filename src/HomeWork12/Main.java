package HomeWork12;

public class Main {
    public static void main(String[] args) {
        Author stiven = new Author("Cтивен", "Кинг");
        Author berd = new Author("Oven", "berd");

        Book king = new Book("It", stiven, 1956);

        king.setBookPublicationYear(1957);

        System.out.println();

        Book stiven2 = new Book("shine", berd, 1858);

        stiven2.setBookPublicationYear(1850);

        System.out.println();

        Author name = new Author("King", "stiven");

        System.out.println();

        Author name2 = new Author("Anna", "Backer");

        System.out.println(berd.equals(stiven));

        printSystem(king);
        printSystem(stiven2);
    }
    private static void printSystem(Book book){
        System.out.println(book.toString());
    }
}

