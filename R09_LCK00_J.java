// Rule 09. Locking (LCK)
// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

public void doSomething() {
    synchronized (this) {
        // Critical section
    }
}
