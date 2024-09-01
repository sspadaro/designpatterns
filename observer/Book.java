package observer;
/**
 * Creates a new book
 */
public class Book{

    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;
    /**
     * Creates a new book
     * @param title title of the book
     * @param genre genre of the book
     * @param authorFirstName author of the book's first name
     * @param authorLastName author of the book's last name
     * @param description description of the book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description){
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }
    /**
     * returns the title of a book
     * @return the title
     */
    public String getTitle(){
        return title;
    }
    /**
     * Return the genre of the book
     * @return the genre
     */
    public Genre getGenre(){
        return genre;
    }
    /**
     * Return the author's first name
     * @return the author's first name
     */
    public String getAuthorFirstName(){
        return authorFirstName;
    }
    /**
     * Return the author's last name
     * @return the author's last name
     */
    public String getAuthorLastName(){
        return authorLastName;
    }
    /**
     * Return a description of a book
     * @return the book's description
     */
    public String getDescription(){
        return description;
    }
    /**
     * Return a string to print out the information of a book
     */
    public String toString(){
        return "\n-----  "+title+" -----\n"+genre+" by: "+authorFirstName+" "+authorLastName+"\n"+description;
    }
}