public interface Creature {
    public boolean  isAlive();
    void showStatus();
    void attack(Character target);
    public String getName();
    public int getHp();
    void setHp(int hp);
}
