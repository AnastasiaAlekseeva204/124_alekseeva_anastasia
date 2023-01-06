public class Warrior {
    private String name;
    private int attack,health;
    public Warrior(String n,int a,int h){
        this.name = n;
        this.attack = a;
        this.health = h;
    }
    public void setHealth(int h){
        this.health = h;
    }
    public String getName(){
       return this.name;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getHealth(){
        return this.health;
    }
    public void TakeDamage(Warrior war){
        System.out.println("Метод класса Warrior");
       // this.health = this.health - war.attack;
        war.health = war.health - this.attack;
    }
    public void print(){
        System.out.println("Name: "+this.getName()+" Attack: "+this.getAttack()+" Health: "+this.getHealth());
    }
}
