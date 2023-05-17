
public class Dinner extends Diet {

	private int spaghettiCount;
	private int pastaCount;
	private int noodlesCount;
	
	public Dinner(String dietName, int spaghettiCount, int pastaCount, int noodlesCount) {
		super(dietName);
		this.spaghettiCount = spaghettiCount;
		this.pastaCount = pastaCount;
		this.noodlesCount = noodlesCount;
	}
	
	public void createCustomDinner() {}
}
