package decorator;

import java.util.ArrayList;
/**
 * Creates a mouth
 * @Author Sophia Spadaro
 */
public class Mouth extends CharacterDecorator{
    /**
     * Adds a mouth to an existing character
     * @param character character that the mouth is being added to
     */
    public Mouth(Character character){
        super(character);
        ArrayList<String> mouth = FileReader.getLines("C:decorator/txt/mouth.txt");
        integrateDecor(mouth);
    }
}
