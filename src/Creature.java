public interface Creature {
    public boolean  isAlive();
    void showStatus();
    void attack(Creature target);
    public String getName();
    public int getHp();
    void setHp(int hp);
}
