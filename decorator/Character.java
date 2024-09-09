package decorator;

import java.util.ArrayList;

public class Character {

    private String name;
    protected ArrayList<String> lines;

    public Character(ArrayList<String> lines, String name){
        this.lines = lines;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        StringBuilder result = new StringBuilder("----- " + name + " ------\n");
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}