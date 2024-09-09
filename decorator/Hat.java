package decorator;

import java.util.ArrayList;

public class Hat extends CharacterDecorator{
    public Hat(Character character){
        super(character);
        ArrayList<String> hat = FileReader.getLines("C:decorator/txt/hat.txt");
        integrateDecor(hat);
    }
}
