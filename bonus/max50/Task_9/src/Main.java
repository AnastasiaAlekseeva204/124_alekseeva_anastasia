public class Main {
    public static void main(String[] args){
      Warrior war = new Warrior("War1",10,200);
      Warrior war1 = new Warrior("WarArrack",30,200);
      ArmoredWarrior ar = new ArmoredWarrior(30,"War2",200,40);
      war1.print();
      war.TakeDamage(war1);
      war1.print();
      ar.print();
      ar.TakeDamage(war1);
      war1.print();

    }
}
