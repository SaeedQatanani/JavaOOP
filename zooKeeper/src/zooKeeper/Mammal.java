package zooKeeper;

public class Mammal {
	protected int energyLevel;
	public Mammal() {
		super();
		this.energyLevel = 100;
	}
	public int displayEnergy() {
		System.out.println(String.format("The current level is %d", energyLevel));
		return this.energyLevel;
	}
	
}
