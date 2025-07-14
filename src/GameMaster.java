import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<String> party = new ArrayList<String>();
        ArrayList<String> monstars = new ArrayList<String>();
        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,100);
        Thief t = new Thief("盗賊",60);
        Matango m = new Matango('A',45);
        Goblin g = new Goblin('A',50);
        Slime s = new Slime('A',40);



    }
}
