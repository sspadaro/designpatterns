package decorator;

public class PotatoeHead extends Character{
    public PotatoeHead(String name){
        super(FileReader.getLines("C:decorator/txt/potatoe-head.txt"), name);
    }
}
