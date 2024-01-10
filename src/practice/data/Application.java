package src.practice.data;

// static block
public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
