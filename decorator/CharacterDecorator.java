package decorator;

import java.util.ArrayList;
/**
 * Adds decorations to an existing character
 * @Author Sophia Spadaro
 */
public abstract class CharacterDecorator extends Character{
    private Character character;
    /**
     * Creates the character that decorations will be added to
     * @param character the character that the decorations are being added to
     */
    public CharacterDecorator(Character character){
        super(character.lines, character.getName());
        this.character = character;
    }
    /**
     * Adds the decoration to an existing character design
     * @param decor an array that holds the design of the decor being added
     */
    protected void integrateDecor(ArrayList<String> decor){
        for(int i=0;i<decor.size();i++){
            String decorLine = decor.get(i);
            String characterLine = this.lines.get(i);

            if(decorLine.trim().length() > 0){
                StringBuilder newLine = new StringBuilder();
                int baseLength = characterLine.length();
                int decorLength = decorLine.length();

                for(int j=0;j<Math.max(baseLength, decorLength);j++){

                    if(j<decorLength && decorLine.charAt(j)!=' '){
                        newLine.append(decorLine.charAt(j));
                    }else if(j<baseLength){
                        newLine.append(characterLine.charAt(j));
                    }else{
                        newLine.append(' ');
                    }
                }
                this.lines.set(i, newLine.toString());
            }
        }
    }
}
