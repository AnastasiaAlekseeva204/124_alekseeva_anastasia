package task;

public class BattleUnit {
    private int strength,health,armor,x, y;
    public BattleUnit(int s,int a,int h,int x,int y){
        this.strength = s;
        this.health = h;
        this.armor = a;
        this.x = x;
        this.y = y;
    }
    public int getStrength(){
        if(this.strength<0){
            this.strength = 0;
        }
        return this.strength;
    }
    public int getArmor(){
        return this.armor;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getHealth(){
        return this.health;
    }
    public void moveUp(){
        this.y = this.getY() + 1;
    }
    public void moveDown(){
        this.y = this.getY() - 1;
    }
    public void moveLeft(){
        this.x = this.getX() + 1;
    }
    public void moveRight(){
        this.x = this.getX()- 1;
    }
    public boolean isAlive(){
        if(this.getHealth()>0){
            return true;
        }
        return false;
    }
    public void attacked(BattleUnit enemy){
        if(this.getArmor()>0){
            if(enemy.getStrength()>=this.getArmor()){
                int a = enemy.getStrength() - this.getArmor();
                this.health = this.getHealth() - a;
            }
            else{
                this.health = this.health;
            }
        }
        else{
            health = health - enemy.health;
        }
        //int a = enemy.getStrength() - enemy.getArmor();
        //this.health = this.getHealth() - a;
    }
}
