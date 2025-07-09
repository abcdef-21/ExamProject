public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public String getName(){// 追加
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSuffix(){// 追加
        return this.suffix;
    }
    public void setSuffix(char suffix){
        this.suffix =suffix;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        if (hp<0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
    public final boolean isAlive(){
        if(hp>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void showStatus(){
        System.out.println(name+":HP"+hp);
    }
    public Monster(char suffix,int hp ){
        this.suffix=suffix;
        this.hp=hp;
    }
}
