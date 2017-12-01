
public class SauronSingleton {
	private String name = "One ring to rule them all!";
	/*
	 * Reads and writes to this will be written back to main
	 * memory not kept in any cache.
	 */
	private volatile static SauronSingleton singleton;
	private static int object_counter;
	
	private SauronSingleton() {
		object_counter++;
		System.out.println("Instantiated: " + name);
	}
	
	/*
	 * Remember!
	 * This static function will always return a reference to
	 * the same instance of the object that we have instantiated.
	 * 
	 * If it so happens that more than one thread has obtained a copy of
	 * the 'singleton' instance variable, then at THAT point, a lock on the class is
	 * obtained. Suppose there are three threads, A,B,C. A enters first, before it has
	 * a chance to test 'singleton' the other threads can not run, so this is only
	 * executed when A is rescheduled. At this point 'singleton' will be assigned 
	 * a reference variable. Note that once this has been instantiated, the sychronized
	 * block is never accessed again. This is the purpose of the double check. 
	 * We avoid a performance hit with this.
	 * 
	 */
	public static SauronSingleton getInstance() {
		if (singleton == null) {
			synchronized (SauronSingleton.class) {
				if (singleton == null) {
					singleton = new SauronSingleton();
				}
			}
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
