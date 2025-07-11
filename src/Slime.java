public final class Slime extends Monster{
    public void attack(Creature target){
        System.out.println("スライム"+getSuffix() +"は体当たり攻撃！"+target.getName()+"に5のダメージを与えた！");
        target.setHp(target.getHp()-5);

    }
}
