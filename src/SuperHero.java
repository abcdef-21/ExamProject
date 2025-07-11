public abstract class SuperHero extends Hero{
    public SuperHero(Hero hero) {
        super();
    }
    public void attack(Creature target){
        System.out.println(getName()+"は"+this.getWeapon()+"で攻撃！"+target.getName()+"に25のダメージを与えた！");
        target.setHp(target.getHp()-25);
    }
}
