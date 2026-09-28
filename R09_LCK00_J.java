// Rule 09. Locking (LCK)
// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

private final Object lock = new Object();

public void doSomething() {
    synchronized (lock) {
        // Critical section
    }
}
