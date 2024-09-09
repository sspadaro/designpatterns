package decorator;

import java.util.ArrayList;

public class Nose extends CharacterDecorator{
    public Nose(Character character){
        super(character);
        ArrayList<String> nose = FileReader.getLines("C:decorator/txt/nose.txt");
        integrateDecor(nose);
    }
}
