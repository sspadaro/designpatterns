package decorator;

import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{
    private Character character;

    public CharacterDecorator(Character character){
        super(character.lines, character.getName());
        this.character = character;
    }
    protected void integrateDecor(ArrayList<String> decor){
        for(int i=0;i<decor.size();i++){
            String decorLine = decor.get(i);
            String line = this.lines.get(i);
            if(decorLine.trim().length() > 0){
                StringBuilder newLine = new StringBuilder();
                int baseLength = line.length();
                int decorLength = decorLine.length();
                for(int j=0;j<Math.max(baseLength, decorLength);j++){
                    if(j<decorLength && decorLine.charAt(j)!=' '){
                        newLine.append(decorLine.charAt(j));
                    }else if(j<baseLength){
                        newLine.append(line.charAt(j));
                    }else{
                        newLine.append(' ');
                    }
                }
                this.lines.set(i, newLine.toString());
            }
        }
    }
}
