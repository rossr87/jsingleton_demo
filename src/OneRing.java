
public class OneRing {
	public static void main(String[] args) {
		SauronSingleton ring = SauronSingleton.getInstance();
		
		System.out.println(ring.getName());
		
		
		SauronSingleton ring2 = SauronSingleton.getInstance();
		
		System.out.println(ring2.getName());
		
		/*
		 * ring and ring2 are actually references to the same object.
		 */
		
		if (ring == ring2) {
			System.out.println("Yes, these two are identical references. This is still only one object");
		}
		
		System.out.println("There is indeed: " + SauronSingleton.getObjectCounter() + " instance. ");
	}
}
