public class Thief extends Character{
    public Thief(Thief thief){
        super(thief.getName(), thief.getHp());
    }
    public void attack(Creature target){
        System.out.println(getName()+"は素早く攻撃した！"+target.getName()+"に5のダメージを与えた！");
        target.setHp(target.getHp()-5);

    }
}
