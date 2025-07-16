import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        ArrayList<Monster> monstars = new ArrayList<>();

        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,100);
        Thief t = new Thief("盗賊",70);

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
        for(Character i : party) {
            i.showStatus();
        }

        System.out.println("---敵グループ---");
        for(Monster j : monstars) {
            j.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for(Character i : party){
            for(Monster j : monstars){
                i.attack(j);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for(Monster j : monstars){
            for(Character i : party){
                j.attack(i);
            }
        }
        System.out.println("\nダメージをを受けた勇者が突然光だした！");
        SuperHero sh = new SuperHero(h);
        party.set(party.indexOf(h), sh);
        System.out.println("勇者はスーパーヒーローに進化した！");
        for(Monster j : monstars) {
            sh.attack(j);
        }
        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character i : party) {
            i.showStatus();
            if(i.isAlive()){
                System.out.println("生存状況:生存");
            }else{
                System.out.println("生存状況:戦闘不能");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster j : monstars) {
            j.showStatus();
            if(j.isAlive()){
                System.out.println("生存状況:生存");
            }else{
                System.out.println("生存状況:討伐済み");
            }
        }






    }
}
