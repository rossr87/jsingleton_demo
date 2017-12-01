
public class SauronSingleton {
	private String name = "One ring to rule them all!";
	private static SauronSingleton singleton;
	private static int object_counter;
	
	private SauronSingleton() {
		object_counter++;
		System.out.println("Instantiated: " + name);
	}
	
	public static SauronSingleton getInstance() {
		if (singleton == null) {
			singleton = new SauronSingleton();
		} else {
			System.out.println("NO! There is only One ring to rule them all");
		}
		return singleton;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getObjectCounter() {
		return object_counter;
	}
}
