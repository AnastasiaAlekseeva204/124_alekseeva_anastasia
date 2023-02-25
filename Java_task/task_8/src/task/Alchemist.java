package task;

public class Alchemist extends BattleUnitBase{
    public Alchemist(String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }
    @Override
   /* public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam){

        int min_health =ownTeam[0].health();
        int max_health =0;
        int index_min=0,index_max=0;
        for(int i = 0; i<ownTeam.length; i++){
            // System.out.println(ownTeam[i].health());
            if (min_health>ownTeam[i].health()) {
                min_health = ownTeam[i].health();
                index_min  = i;
            }
            if (max_health<ownTeam[i].health()) {
                max_health = ownTeam[i].health();
                index_min  = i;
            }
        }

        //System.out.println("Max health and index"+max_health+" "+index_max);
        //System.out.println("Min health and index"+min_health+" "+index_min);
        ownTeam[index_min].heal(10);
        ownTeam[index_max].setStrength(ownTeam[index_max].strength()+1);
    }*/
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxHealth = 0;
        int minHealth = Integer.MAX_VALUE;
        int scor1 = 0;
        int scor2 = 0;
        for (int a = 0; a < ownTeam.length; a++){
            BattleUnit owner = ownTeam[a];
            if ((owner.health()>maxHealth) && (owner.health()>0)){
                maxHealth = owner.health();
                scor1 = a;
            }
            if ((owner.health()<maxHealth) && (owner.health()>0)){
                minHealth = owner.health();
                scor2 = a;
            }
        }
        final BattleUnit ownMaxHealth = ownTeam[scor1];
        final BattleUnit ownMinHealth = ownTeam[scor2];
        ownMinHealth.heal(10);
        ownMaxHealth.setStrength(ownMaxHealth.strength() + 1);
    }
    @Override
    public void attack(BattleUnit other){

        other.setMaxHealth(other.maxHealth()-4);
        other.setStrength(other.strength()-2);
    }
}

