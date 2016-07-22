package tsm00_J_CSPFLO;

class Derived extends Base {

	private final Object lock = new Object();
	@Override 
	public void doSomething() { 
		synchronized (lock) {
	
// ... 
			}
	} 
}
