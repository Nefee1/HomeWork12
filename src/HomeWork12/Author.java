package HomeWork12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, surnameAuthor);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                '}';
    }
}