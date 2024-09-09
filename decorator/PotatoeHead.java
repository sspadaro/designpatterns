package decorator;
/**
 * Creates a potato head character
 * @author Sophia Spadaro
 */
public class PotatoeHead extends Character{
    /**
     * Creates a potato head character
     * @param name Name of the potato head character
     */
    public PotatoeHead(String name){
        super(FileReader.getLines("C:decorator/txt/potatoe-head.txt"), name);
    }
}
