
public class Lunch extends Diet {
	
	private int sandwichCount;
	private int saladCount;
	private int burgerCount;
	
	public Lunch(String dietName, int sandwichCount, int saladCount, int burgerCount) {
		super(dietName);
		this.sandwichCount = sandwichCount;
		this.saladCount = saladCount;
		this.burgerCount = burgerCount;
	}
	
	public void createCustomLunch() {}
}
