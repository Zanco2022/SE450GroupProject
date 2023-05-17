
public class Breakfast extends Diet {
	
	private int eggsCount;
	private int toastCount;
	private int baconCount;
	
	public Breakfast(String dietName, int eggsCount, int toastCount, int baconCount) {
		super(dietName);
		this.eggsCount = eggsCount;
		this.toastCount = toastCount;
		this.baconCount = baconCount;
	}
	
	public void createCustomBreakfast() {}
}
