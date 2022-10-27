package zooKeeper;

public class Bat extends Mammal {

    public Bat() {
        super();
        this.energyLevel = 300;
    }
    public void fly() {
        System.out.println("ooooofff");
        this.energyLevel -= 50;
        this.displayEnergy();
    }
    public void eatHumans() {
        System.out.println("A7A");
        this.energyLevel += 25;
        this.displayEnergy();
    }
    public void attackTown() {
        System.out.println("ttt");
        this.energyLevel -= 100;
        this.displayEnergy();
    }
}
