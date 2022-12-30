package task;

public enum Race {
    Orc(6, 12, 2), Elf(2, 9, 9), Dwarf(6, 10, 4), Halfling(1, 8, 11), Human(6, 7, 7);
     Race(int s, int h, int d) {
        this.strength = s;
        this.health = h;
        this.dexterity = d;
    }

    private int strength, health, dexterity;
    public int strength() {
        return this.strength;
    }

    public int health() {
        return this.health;
    }

    public int dexterity() {
        return this.dexterity;
    }
}
