package dealership.util;

public class IDGenerator {
    private static IDGenerator instance;
    private long currentId;

    private IDGenerator() {
        currentId = 0;
    }

    public static synchronized IDGenerator getInstance() {
        if (instance == null) {
            instance = new IDGenerator();
        }
        return instance;
    }

    public synchronized long getNextId() {
        return ++currentId;
    }
}
