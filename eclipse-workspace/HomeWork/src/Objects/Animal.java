package Objects;

public class Animal {

	public String name;
	public String color;
	public int legsAmount;

	public Animal(String name, String color, int legsAmount) {
		this.name = name;
		this.color = color;
		this.legsAmount = legsAmount;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", legsAmount=" + legsAmount + "]";
	}

}
