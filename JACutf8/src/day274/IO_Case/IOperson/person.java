package day274.IO_Case.IOperson;

public class person {
    String name;
    int FightingCapacity;

    public person(){
    }

    public person(String name, int fightingCapacity) {
        this.name = name;
        this.FightingCapacity = fightingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFightingCapacity() {
        return FightingCapacity;
    }

    public void setFightingCapacity(int fightingCapacity) {
        FightingCapacity = fightingCapacity;
    }
}
