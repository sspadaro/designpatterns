package decorator;

import java.util.ArrayList;
/**
 * Creates a character
 * @Author Sophia Spadaro
 */
public class Character {

    private String name;
    protected ArrayList<String> lines;
    /**
     * Creates a new character
     * @param lines An array with the design of the character
     * @param name The name of the character
     */
    public Character(ArrayList<String> lines, String name){
        this.lines = lines;
        this.name = name;
    }
    /**
     * Returns the name of the character
     * @return the character's name
     */
    public String getName(){
        return name;
    }
    /**
     * Prints out the character and his name
     */
    public String toString(){
        StringBuilder result = new StringBuilder("----- " + name + " ------\n");
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}