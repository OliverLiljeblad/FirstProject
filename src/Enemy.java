public class Enemy {
    //Instansvariabler
    //Instance variables
    private String name = "A Enemy";
    private int hp = 100;

    public Enemy() {

    }

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy(String name, boolean isFriend) {
        this.name = name;
    }

    public void hit(int damage) {
        this.hp = this.hp - damage;
    }

    // Getters Setters
    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
