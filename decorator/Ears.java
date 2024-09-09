package decorator;

import java.util.ArrayList;
/**
 * Creates ears
 * @Author Sophia Spadaro
 */
public class Ears extends CharacterDecorator{
    /**
     * Adds ears to an existing character
     * @param character character that the ears are being added to
     */
    public Ears(Character character){
        super(character);
        ArrayList<String> ears = FileReader.getLines("C:decorator/txt/ears.txt");
        integrateDecor(ears);
    }
}
