 public class ArmoredWarrior extends Warrior {
    private int armor;
    public ArmoredWarrior (int armor,String name, int health,int attack){
        super(name,health,attack);
        this.armor = armor;

    }
    public int getArmor(){
        return this.armor;
    }
    @Override
    public void TakeDamage(Warrior war) {
      // super.TakeDamage(this.getHealth()/this.getArmor());
       // super.TakeDamage(war);
        //this.armor = this.getAttack()-this.getArmor();
        System.out.println("Я TakeDamage(Warrior war)");
        int h;
        h = war.getHealth() - this.armor;
        if(h<1){
            h = 1;
        }
        war.setHealth(h);
    }
     public void print(){
         System.out.println("Name: "+this.getName()+" Attack: "+this.getAttack()+" Health: "+this.getHealth()+" Arrmor: "+this.getArmor());
     }
}

