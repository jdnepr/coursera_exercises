package template_method_pattern;

public abstract class PastaDish {
	
	final void makeRecipe() {
		boilWater();
		addPasta();
		cookPasta();
		drainAndPlate();	
		addSauce();
		addProtein();
		addGarnish();
	}
	
	private void boilWater() {
		System.out.println("Water is boiled.");
	}
	
	private void cookPasta() {
		System.out.println("Cook pasta in water.");
	}
	
	private void drainAndPlate() {
		System.out.println("Drain pasta and put it on the plate.");
	}
	
	public abstract void addPasta();
	public abstract void addSauce();
	public abstract void addProtein();
	public abstract void addGarnish();
	
}
