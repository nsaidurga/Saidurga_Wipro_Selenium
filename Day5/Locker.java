/*
 4. Inner Class Encapsulation: Secure Locker
Encapsulate helper logic inside the class.
a)	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
b)	Use an inner private class SecurityManager to handle passcode verification logic.
c)	Only expose public methods: lock(), unlock(String code), isLocked().
d)	Password attempts should not leak verification logic externally—only success/failure.
e)	Ensure no direct access to passcode or the inner SecurityManager from outside.

 */
package Day5;

public class Locker {
	private String lockerId;
	private boolean isLocked;
	private String passcode;

	private class SecurityManager {
		private boolean verify(String inputCode) {
			return inputCode != null && inputCode.equals(passcode);
		}
	}

	public Locker(String lockerId, String passcode) {
		this.lockerId = lockerId;
		this.passcode = passcode;
		this.isLocked = true;
	}

	public void lock() {
		isLocked = true;
		System.out.println("Locker " + lockerId + " is now locked.");
	}

	public boolean unlock(String code) {
		SecurityManager sm = new SecurityManager();
		if (sm.verify(code)) {
			isLocked = false;
			System.out.println("Loker " + lockerId + " unlock successfully");
			return true;
		} else {
			System.out.println("Incorrect passcode. Access denied.");
			return false;
		}
	}

	public boolean isLocked() {
		return isLocked;
	}

	public static void main(String[] args) {
		Locker locker = new Locker("A342", "secure123");
		locker.unlock("secure#243");
		locker.unlock("secure123");
		locker.lock();
		System.out.println("Is Locked: " + locker.isLocked);
	}

}

/*
 output: 
 
 Incorrect passcode. Access denied. 
 Loker A342 unlock successfully
 Locker A342 is now locked. Is Locked: true
 
 */