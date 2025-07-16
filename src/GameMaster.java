import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        ArrayList<Monster> monstars = new ArrayList<>();

        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,100);
        Thief t = new Thief("盗賊",60);

        Matango m = new Matango('A',45);
        Goblin g = new Goblin('A',50);
        Slime s = new Slime('A',40);

        party.add(h);
        party.add(w);
        party.add(t);

        monstars.add(m);
        monstars.add(g);
        monstars.add(s);

        System.out.println("---味方パーティ---");
        h.showStatus();
        w.showStatus();
        t.showStatus();
        System.out.println("---敵グループ---");
        m.showStatus();
        g.showStatus();
        s.showStatus();

        System.out.println("味方の総攻撃");
        for(Character i : party){
            for(Monster j : monstars){
                i.attack(j);
            }
        }
        System.out.println("敵の総攻撃");
        for(Monster j : monstars){
            for(Character i : party){
                j.attack(i);
            }
        }
        System.out.println("ダメージをを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero sh = new SuperHero(h);
        party.set(party.indexOf(h), sh);
        System.out.println("勇者はスーパーヒーローに進化した！");
        for(Monster j : monstars) {
            sh.attack(j);
        }







    }
}
