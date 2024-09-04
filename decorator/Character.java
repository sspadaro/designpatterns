package decorator;

import java.util.ArrayList;

public class Character {

    private String name;
    protected ArrayList<String> lines;

    public Character(ArrayList<String> lines, String name){

    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "----- "+name+" ------\n"+lines;
    }
}