package lab2.problem1.b;

public class Book extends LibraryItem {

    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    // getter
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // setter
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // method
    public boolean isLongBook() {
        return numberOfPages >= 300;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pages: " + numberOfPages + ", Long book: " + (isLongBook() ? "Yes" : "No");
    }
}