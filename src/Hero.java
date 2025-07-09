public abstract class Hero extends Character{

    private String weapon;
    public Hero(Hero hero) {
        super(hero.getName(), hero.getHp());
    }
    public void attack(Creature target){
        System.out.println(getName()+"は"+this.weapon+"で攻撃！"+target.getName()+"に10のダメージを与えた！");
        target.setHp(target.getHp()-10);
    }
    public String getWeapon(){// 追加
        return this.weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon=weapon;
    }

}
