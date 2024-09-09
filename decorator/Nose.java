package decorator;

import java.util.ArrayList;
/**
 * Creates a nose
 * @Author Sophia Spadaro
 */
public class Nose extends CharacterDecorator{
    /**
     * Adds a nose to an existing character
     * @param character character that the nose is being added to
     */
    public Nose(Character character){
        super(character);
        ArrayList<String> nose = FileReader.getLines("C:decorator/txt/nose.txt");
        integrateDecor(nose);
    }
}
