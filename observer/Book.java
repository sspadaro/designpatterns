package observer;

public class Book{
    
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description){
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }
    public String getTitle(){
        return title;
    }
    public Genre getGenre(){
        return genre;
    }
    public String getAuthorFirstName(){
        return authorFirstName;
    }
    public String getAuthorLastName(){
        return authorLastName;
    }
    public String getDescription(){
        return description;
    }
    public String toString(){
        return "\n-----  "+title+" -----\n"+genre+" by: "+authorFirstName+" "+authorLastName+"\n"+description;
    }
}