public class Book {
    private String title;
    private String author;
    
    public Book(String theTitle, String theAuthor) {
        title = theTitle;
        author = theAuthor;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return title + " by " + author;
    }
    
    public boolean equals(Book other) {
        return title.equals(other.title) && author.equals(other.author);
    }
}
