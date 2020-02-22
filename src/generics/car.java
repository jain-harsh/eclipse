package generics;

public class car implements Comparable<car> {
	int speed;
	String color;
	int price;

	public car(int speed, String color, int price) {
		this.speed = speed;
		this.color = color;
		this.price = price;
	}

	public String toString() {
		return speed + " " + color + " " + price;
	}

	public boolean compareto(car other) {
		return this.speed > other.speed;
	}

	@Override
	public int compareTo(car other) {
		return this.speed - other.speed;

	}
}
