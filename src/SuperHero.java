public abstract class SuperHero extends Hero{
    public SuperHero(Hero hero) {
        super(hero.getName(), hero.getHp(),hero.getWeapon());
    }
    public void attack(Creature target){
        System.out.println(getName()+"は"+this.weapon+"で攻撃！"+target.getName()+"に25のダメージを与えた！");
        target.setHp(target.getHp()-25);
    }
}
