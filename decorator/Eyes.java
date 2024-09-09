package decorator;

import java.util.ArrayList;

public class Eyes extends CharacterDecorator{
    public Eyes(Character character){
        super(character);
        ArrayList<String> eyes = FileReader.getLines("C:decorator/txt/eyes.txt");
        integrateDecor(eyes);
    }
}
