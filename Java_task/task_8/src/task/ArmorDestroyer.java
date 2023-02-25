package task;

public class ArmorDestroyer extends BattleUnitBase{
    public ArmorDestroyer(String n, int mh,int ps,int ms){
        super(n,mh,ps,ms);
    }
    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxEnemyArmor = 0;
        int scor = 0;
        for (int i = 0; i < enemyTeam.length; i++){
            BattleUnit enemy = enemyTeam[i];
            if ((enemy.armor()>maxEnemyArmor) && (enemy.health()>0)){
                maxEnemyArmor = enemy.armor();
                scor = i;
            }
        }
        final BattleUnit enemy = enemyTeam[scor];
        double lstrength = (this.strength()*2);
        double cstrength = (this.strength()/4);
        if (lstrength < 1){
            lstrength = 1;
        }
        if (cstrength < 1){
            cstrength = 1;
        }
        if (enemy.armor() > 0){
            enemy.damageArmor((int) lstrength);
        }
        else {
            enemy.takeDamage((int) cstrength);
        }
    }
    @Override
    public void attack(BattleUnit other){
        float st2 = (this.strength()/2);
        float st4 = (this.strength()/4);
        if(st2<1) st2 = 1;
        if(st4<1) st4=1;
        if(other.armor()>0){
            other.takeDamage((int)st4);
            other.damageArmor((int)this.strength());
        }
        else{
            other.takeDamage((int)st2);
        }
    }

}

