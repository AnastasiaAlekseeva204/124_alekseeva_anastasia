package task;

public class Infantryman extends task.BattleUnitBase{
    public Infantryman(String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }
    @Override
    public void attack (BattleUnit other) {
        double hstrength = (this.strength()/2);
        double qstrength = (this.strength()/4);
        if (hstrength < 1){
            hstrength = 1;
        }
        if (qstrength < 1){
            qstrength = 1;
        }
        if (other.armor() > 0){
            other.takeDamage((int) hstrength);
            other.damageArmor((int) qstrength);
        }
        else {
            other.takeDamage((int) this.strength());
        }
    }
    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam){
    }
   /** public String name(){
        return this.name();
    }
    public int health(){
        return this.health();
    }
    public int maxHealth(){
        return this.maxHealth();
    }
    public void setMaxHealth(int value){
        this.setMaxHealth(value);
    }
    public void heal(int value){
      this.heal(value);
    }
    public void takeDamage(int value) {
        if(value < 1 ){
            value = 1;
        }
      this.takeDamage(value);
    }
    public int strength(){
        return this.strength();
    }
    public void setStrength(int value){
       this.setStrength(value);
    }
    public int baseStrength(){
        return this.baseStrength();
    }
    public int armor(){
        return this.armor();
    }
    public void restoreArmor(int value){
        this.restoreArmor(value);

    }
    public void damageArmor(int value){
        if(value < 1 ){
            value = 1;
        }
        this.damageArmor(value);
    }
    public int maxArmor(){
        return this.maxArmor();
    }
    public void setMaxArmor(int value){
        this.setMaxArmor(value);
    }*/
}
