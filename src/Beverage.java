
public abstract class Beverage {
	protected String description = "Unknown Beverage";
	protected int size = Beverage.SMALL;
	private String sizeName = "Small";
	public final static int SMALL = 1;
	public final static int MEDIUM = 2;
	public final static int LARGE = 3;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		
		if (size == Beverage.MEDIUM){
			sizeName = "Medium";
		}else if (size == Beverage.LARGE){
			sizeName = "Large";
		}
		description = sizeName + " " + description;
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
