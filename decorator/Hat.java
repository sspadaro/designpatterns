package decorator;

import java.util.ArrayList;
/**
 * Creates a hat
 * @Author Sophia Spadaro
 */
public class Hat extends CharacterDecorator{
    /**
     * Adds a hat to an existing character
     * @param character character that the hat is being added to
     */
    public Hat(Character character){
        super(character);
        ArrayList<String> hat = FileReader.getLines("C:decorator/txt/hat.txt");
        integrateDecor(hat);
    }
}
