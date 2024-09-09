package decorator;

import java.util.ArrayList;

public class Ears extends CharacterDecorator{
    public Ears(Character character){
        super(character);
        ArrayList<String> ears = FileReader.getLines("C:decorator/txt/ears.txt");
        integrateDecor(ears);
    }
}
