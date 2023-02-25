package task;
public abstract class BattleUnitBase implements BattleUnit{
    private  final String name;
    private int perHealth;
    private int perMaxHealth;
    private  int basePerStrenght;
    private int perStrenght;
    private int perArmor;
    private int perMaxArmor;
    public BattleUnitBase(String name, int maxHealth,int baseStrenght,int maxArmor){
        this.name = name;
        this.perMaxHealth = maxHealth;
        this.perHealth = maxHealth;
        this.perStrenght = baseStrenght;
        this.perArmor = maxArmor;
        this.basePerStrenght = baseStrenght;
        this.perMaxArmor = maxArmor;
    }
    abstract public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    abstract public void attack(BattleUnit other);
    @Override
    public String name(){
        return this.name;
    }
    @Override
    public int health(){
        return this.perHealth;
    }
    @Override
    public int maxHealth(){
        return this.perMaxHealth;
    }
    @Override
    public void setMaxHealth(int value){
        this.perMaxHealth = value;
        if(this.perHealth>=this.perMaxHealth){
            this.perHealth = perMaxHealth;
        }
    }
    @Override
    public void heal(int value){
        this.perHealth = this.perHealth + value;
        if(this.perHealth>=this.perMaxHealth){
            this.perHealth = this.perMaxHealth;
        }
    }
    @Override
    public void takeDamage(int value) {
        this.perHealth = this.perHealth - value;
        if(this.perHealth<=0){
            this.perHealth = 0;
        }
    }
    @Override
    public int strength(){
        return this.perStrenght;
    }
    @Override
    public void setStrength(int value){
        this.perStrenght = value;
    }
    @Override
    public int baseStrength(){
        return this.basePerStrenght;
    }
    @Override
    public int armor(){
        return this.perArmor;
    }
    @Override
    public void restoreArmor(int value){
        this.perArmor = this.perArmor + value;
        if(this.perArmor>=this.perMaxArmor)
            this.perArmor = this.perMaxArmor;
    }
    @Override
    public void damageArmor(int value){
        this.perArmor = this.perArmor - value;
        if(this.perArmor<0)
            this.perArmor = 0;
    }
    @Override
    public int maxArmor(){
        return this.perMaxArmor;
    }
    @Override
    public void setMaxArmor(int value){
        this.perMaxArmor = value;
        if (this.perArmor >= perMaxArmor) {
            this.perArmor = this.perMaxArmor;
        }
    }
}

