package design_patterns.singleton.multi_threaded_lazy_initialization;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE = null;

    private DatabaseConnection(){
        System.out.println("Connecting to database");
    }

    public static DatabaseConnection getInstance(){
        if(INSTANCE == null){
            synchronized (DatabaseConnection.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DatabaseConnection();
                }
            }
        }
        return INSTANCE;
    }
}
