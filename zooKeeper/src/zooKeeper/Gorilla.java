package zooKeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("Careful! A gorilla has throw sth.");
		this.energyLevel -= 5;
		this.displayEnergy();
	}
	public void eatBananas() {
		System.out.println("Gorilla is on fire.");
		this.energyLevel += 10;
		this.displayEnergy();
	}
	public void climb() {
		System.out.println("Careful! A gorilla has climbed a tree");
		this.energyLevel -= 10;
		this.displayEnergy();
	}
}
