package decorator;

import java.util.ArrayList;
/**
 * Creates eyes
 * @Author Sophia Spadaro
 */
public class Eyes extends CharacterDecorator{
    /**
     * Adds eyes to an existing character
     * @param character character that the eyes are being added to
     */
    public Eyes(Character character){
        super(character);
        ArrayList<String> eyes = FileReader.getLines("C:decorator/txt/eyes.txt");
        integrateDecor(eyes);
    }
}
