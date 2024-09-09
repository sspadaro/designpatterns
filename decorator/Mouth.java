package decorator;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator{
    public Mouth(Character character){
        super(character);
        ArrayList<String> mouth = FileReader.getLines("C:decorator/txt/mouth.txt");
        integrateDecor(mouth);
    }
}
