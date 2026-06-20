public class SingletonPatternExample {

    // Step 1: private static instance of itself
    private static SingletonPatternExample instance;

    // Step 2: private constructor — no one can create object directly
    private SingletonPatternExample() {
        System.out.println("Logger instance created!");
    }

    // Step 3: public static method to get the single instance
    public static SingletonPatternExample getInstance() {
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }

    // Test the Singleton
    public static void main(String[] args) {
        SingletonPatternExample logger1 = SingletonPatternExample.getInstance();
        SingletonPatternExample logger2 = SingletonPatternExample.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
    }
}