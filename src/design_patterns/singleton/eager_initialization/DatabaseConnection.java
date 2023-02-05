package design_patterns.singleton.eager_initialization;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE = new DatabaseConnection();

    private DatabaseConnection(){
        System.out.println("Connecting to database");
    }

    public static DatabaseConnection getInstance(){
        return INSTANCE;
    }
}
