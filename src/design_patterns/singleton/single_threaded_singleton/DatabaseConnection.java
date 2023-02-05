package design_patterns.singleton.single_threaded_singleton;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE = null;

    private DatabaseConnection(){
        System.out.println("Connecting to database");
    }

    public static DatabaseConnection getInstance(){
        if(INSTANCE == null){
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }
}
